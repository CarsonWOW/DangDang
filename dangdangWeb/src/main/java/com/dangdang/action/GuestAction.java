package com.dangdang.action;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.dangdang.po.DangdangComment;
import com.dangdang.service.DangdangCommentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@Transactional
@RequestMapping("Guest")
/**
 * 留言控制层
 */
public class GuestAction {
    @Resource
    private DangdangCommentService commentService;
    //查询留言内容
    @RequestMapping("guest")
    public String guest(Model model, Integer PageNow){
        //如果当前页没有值,则设为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //分页查询,PageNow,当前第几页,pageSize,一页显示多少条
        PageHelper.startPage(PageNow,3);
        List<DangdangComment> comments=commentService.selectByExample(null);
        PageInfo<DangdangComment> CommentsPageInfo=new PageInfo<DangdangComment>(comments);
        model.addAttribute("CList", CommentsPageInfo.getList());
        model.addAttribute("pageInfo",CommentsPageInfo);
        return "guestbook";
    }
    //添加留言内容
    @RequestMapping("addGuest")
    public String addGuest(DangdangComment comment,Model model){
        //调用业务层添加方法
        commentService.Commentinsert(comment);
        return "forward:/rest/Guest/guest";
    }
    //跳转后台留言管理
    @RequestMapping("ManageGuest")
    public String ManageGuest(Model model, Integer PageNow){
        //如果当前页没有值,则设为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //分页查询,PageNow,当前第几页,pageSize,一页显示多少条
        PageHelper.startPage(PageNow,3);
        List<DangdangComment> comments=commentService.selectByExample(null);
        PageInfo<DangdangComment> CommentsPageInfo=new PageInfo<DangdangComment>(comments);
        model.addAttribute("CList", CommentsPageInfo.getList());
        model.addAttribute("pageInfo",CommentsPageInfo);
        return "/manage/guestbook";
    }
    //根据Id查询
    @RequestMapping("FindGuestById")
    public String FindGuestById(Integer duId,HttpSession session){
        //调用业务层根据id查询方法
        DangdangComment dangdangComment=commentService.selectByPrimaryKey(duId);
        //将DangdangComment对象存入session
        session.setAttribute("dangdangComment",dangdangComment);
        return "/manage/guestbook-modify";
    }
    //回复留言
    @RequestMapping("AnswerGuest")
    public String AnswerGuest(DangdangComment comment,HttpSession session){
        //调用业务层根据id修改方法
        commentService.updateByPrimaryKeySelective(comment);
        return "forward:/rest/Guest/ManageGuest";
    }
}
