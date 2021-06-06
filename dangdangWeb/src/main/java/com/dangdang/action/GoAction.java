package com.dangdang.action;


import com.dangdang.po.DangdangNews;
import com.dangdang.po.DangdangProduct;
import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;
import com.dangdang.service.DangDangProductCategoryService;
import com.dangdang.service.DangDangProductService;
import com.dangdang.service.DangdangNewsService;
import com.dangdang.service.UserServcie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoAction {
	@Resource
	private DangDangProductCategoryService categoryService;
	@Resource
	private UserServcie userServcie;
	@Resource
	private DangDangProductService dangDangProductService;
	@Resource
	private DangdangNewsService dangdangNewsService;

	//首页
	@RequestMapping("/goIndex")
	public String GoIndex(Model model, HttpSession session){
		List<DangdangProduct> ProductList=dangDangProductService.QueryProductByChildID(null,null);
		model.addAttribute("ProductList",ProductList);
		//先从session获取值
		List<DangdangProductCategory> Category=(List<DangdangProductCategory>)session.getAttribute("Category");
		DangdangProductCategoryExample example=new DangdangProductCategoryExample();
		List<DangdangNews> NewsList=dangdangNewsService.selectByExample(null);
		if (Category==null){
			Category=categoryService.selectByExample(example);
		}
		session.setAttribute("Category",Category);
		session.setAttribute("NewsList",NewsList);
		//将list存入作用域,前端用于获取值
		//业务层
		return "index";
	}
	//后台
	@RequestMapping("/goManage")
	public String GoManage(Model model){
		return "manage/index";
	}
	//登录
	@RequestMapping("/UserLogin")
	public String GoLogin(Model model){

		return "login";
	}
	//注册
	@RequestMapping("/GoRegister")
	public String GoRegister(Model model){
		return "register";
	}
	//退出登录
	@RequestMapping("/Clean")
	public String Clean(Model model,HttpSession session){
		session.removeAttribute("User");
		return "redirect:/rest/goIndex";

	}
	//添加商品
	@RequestMapping("addProduct")
	public String addProduct(){
		return "/manage/product-add";
	}
	//后台修改后页面
	@RequestMapping("UResult")
	public String UpdateResult(){
		return "/manage/manage-result";
	}
	//后台添加用户
	@RequestMapping("AddUser")
	public String AddUser(){
		return "/manage/user-add";
	}
	//添加商品标题
	@RequestMapping("AddCategory")
	public String AddCategory(Model model){
		List<DangdangProductCategory> categories=categoryService.selectByExample(null);
		model.addAttribute("categories",categories);
		return "/manage/productClass-add";
	}
	//订单管理
	@RequestMapping("Order")
	public String Order(){
		return "/manage/order";
	}



}
