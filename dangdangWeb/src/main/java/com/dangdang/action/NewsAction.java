package com.dangdang.action;

import com.dangdang.po.DangdangNews;
import com.dangdang.service.DangdangNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("News")
public class NewsAction {
    @Resource
    private DangdangNewsService newsService;
    //新闻查询
    @RequestMapping("news")
    public String News(Model model, HttpSession session,Integer PageNow){
        //如果当前页为null,就设置为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //设置为当前页,条数3条
        PageHelper.startPage(PageNow,3);
        List<DangdangNews> list=newsService.selectByExample(null);
        PageInfo<DangdangNews> pageInfo=new PageInfo<DangdangNews>(list);
        session.setAttribute("nList",pageInfo.getList());
        session.setAttribute("pageInfo",pageInfo);
        /*session.addAttribute("nList",pageInfo.getList());
        session.addAttribute("pageInfo",pageInfo);*/
        return "/manage/news";
    }
    //根据Id查询
    @RequestMapping("FindNewsById")
    public String FindNewsById(Model model,Integer dnId){
        DangdangNews dangdangNews=newsService.selectByPrimaryKey(dnId);
        model.addAttribute("news",dangdangNews);
        return "manage/news-modify";
    }
    //修改
    @RequestMapping("updateNews")
    public String updateNews(Model model,DangdangNews dangdangNews){
        newsService.updateByPrimaryKeySelective(dangdangNews);
        return "forward:/rest/News/news";
    }
    //删除
    @RequestMapping("DeleteNews")
    public String DeleteNews(Model model,Integer id){
        newsService.deleteByPrimaryKey(id);
        return "forward:/rest/News/news";
    }
    //新增新闻
    @RequestMapping("addNews")
    public String addNews(Model model){
        return "/manage/news-add";
    }
    //添加新闻
    @RequestMapping("showNews")
    public String showNews(Model model,DangdangNews dangdangNews){
        newsService.insert(dangdangNews);
        return "forward:/rest/News/news";
    }
    //根据id查询,跳转到news-view
    @RequestMapping("QueryNewsById")
    public String QueryNewsById(Model model,Integer dnId){
        DangdangNews dangdangNews=newsService.selectByPrimaryKey(dnId);
        model.addAttribute("news",dangdangNews);
        return "news-view";
    }
}
