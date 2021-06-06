package com.dangdang.action;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dangdang.po.DangdangProduct;
import com.dangdang.po.DangdangUser;
import com.dangdang.po.User;
import com.dangdang.service.DangDangUserService;
import com.dangdang.service.UserServcie;
import com.dangdang.util.DESUtil;
import com.dangdang.util.ImageCode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class UserAction {

	//注入业务层 
	@Resource
	private DangDangUserService userService;
	//登录
	@RequestMapping("/login")
	public String Login(Model model, HttpSession session, DangdangUser dangdangUser){
		dangdangUser=userService.UserLogin(dangdangUser);
		/*if (dangdangUser!=null){
			//将密码加密
			String pwd=DESUtil.getDecryptString(dangdangUser.getDuPassword());
			dangdangUser.setDuPassword(pwd);
		}*/
		//判断用户权限1为普通用户
		if (dangdangUser!=null){
			//登录如果有值则将用户信息存入作用域
			session.setAttribute("User",dangdangUser);
			if (dangdangUser.getDuStatus()==1) {
				return "redirect:/rest/goIndex";
			}else{
				return "manage/index";
			}
		}else {
			return "login";
		}
	}
	@RequestMapping("/check_code")
	public void validPic(HttpServletResponse response, HttpSession session) throws Exception {
		try {
			Map<String, BufferedImage> map = ImageCode.getImage(80, 42, 4, 20);
			String checkCode = map.keySet().iterator().next();
			//验证码失去焦点事件,存入checkCode
			session.setAttribute("imageCode", checkCode);
			BufferedImage image = map.values().iterator().next();
			// 禁止图像缓存。
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);

			response.setContentType("image/jpeg");

			ImageIO.write(image, "jpeg",

					response.getOutputStream()

			);
		} catch (Exception e) {
			System.out.println("check code error:"+e);
			throw e;
		}
	}
	@RequestMapping("/code")
	public void CheckCode(HttpSession session,String veryCode,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		//拿到生成的验证码信息
		String imageCode=(String)session.getAttribute("imageCode");
		String msg="Err";
		//在比较输入的验证码信息
		//如果相等
		if (veryCode.toUpperCase().equals(imageCode.toUpperCase())){//toUpperCase(),将信息转为大写
			msg="Right";
		}
		out.print(msg);
	}
	//注册信息
	@RequestMapping("/GoRegisterMsg")
	public String GoRegisterMsg(DangdangUser dangdangUser, String birthyear,String birthmonth,String birthday,HttpSession session){
		//拼接日期
		String time=birthyear+"-"+birthmonth+"-"+birthday;
		Date date=Date.valueOf(time);
		dangdangUser.setDuBirthday(date);
		//只要是注册的用户,都是普通用户,权限为1
		dangdangUser.setDuStatus(1);
		session.setAttribute("User",dangdangUser);
		int i=userService.insert(dangdangUser);
		if (i<1){
			return "register";
		}
		return "reg-result";
	}
	//后台用户管理
	@RequestMapping("UserList")
	public String UserList(Integer PageNow,Model model){
		//如果当前页没有值,则设为第1页
		if (PageNow==null){
			PageNow=1;
		}
		//分页查询,PageNow,当前第几页,pageSize,一页显示多少条
		PageHelper.startPage(PageNow,3);
		List<DangdangUser> users=userService.selectByExample(null);
		PageInfo<DangdangUser>  userPageInfo=new PageInfo<DangdangUser>(users);
		model.addAttribute("uList", userPageInfo.getList());
		model.addAttribute("pageInfo",userPageInfo);
		return "/manage/user";
	}
	//根据id查询
	@RequestMapping("FindUserByID")
	public String updateUser(Integer duUserId,Model model){
		DangdangUser dangdangUser=userService.selectByPrimaryKey(duUserId);
		model.addAttribute("dangdangUser",dangdangUser);
		return "/manage/user-modify";
	}
	//修改用户
	@RequestMapping("UpdateUser")
	public String UpdateUser(DangdangUser dangdangUser,Model model){
		int i=userService.updateByPrimaryKeySelective(dangdangUser);
		return "/manage/manage-result";
	}
	//删除用户
	@RequestMapping("DeleteUser")
	public String DeleteUser(Integer id,Model model){
		userService.deleteByPrimaryKey(id);
		return "forward:/rest/user/UserList";
	}
	//添加用户
	@RequestMapping("addUser")
	public String addUser(DangdangUser dangdangUser,String birthyear,String birthmonth,
			String birthday, Model model){
		//拼接日期
		String time=birthyear+"-"+birthmonth+"-"+birthday;
		Date date=Date.valueOf(time);
		dangdangUser.setDuBirthday(date);
		userService.insert(dangdangUser);
		return "/manage/manage-result";
	}
}
