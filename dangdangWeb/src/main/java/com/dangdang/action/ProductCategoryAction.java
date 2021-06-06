package com.dangdang.action;

import com.dangdang.po.DangdangProduct;
import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangUser;
import com.dangdang.service.DangDangProductCategoryService;
import com.dangdang.service.DangDangProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("Category")
public class ProductCategoryAction {
    //依赖注入业务层
    @Resource
    private DangDangProductCategoryService categoryService;
    @Resource
    private DangDangProductService productService;
    //分类管理
    @RequestMapping("productClass")
    public String productClass(Model model, HttpSession session,Integer PageNow){
        //如果当前页没有值,则设为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //分页查询,PageNow,当前第几页,pageSize,一页显示多少条
        PageHelper.startPage(PageNow,6);
        List<DangdangProductCategory> categories=categoryService.selectByExample(null);
        PageInfo<DangdangProductCategory> CategoryPageInfo=new PageInfo<DangdangProductCategory>(categories);
        /*session.addAttribute("cList", CategoryPageInfo.getList());
        model.addAttribute("pageInfo",CategoryPageInfo);*/
        session.setAttribute("cList",CategoryPageInfo.getList());
        session.setAttribute("pageInfo",CategoryPageInfo);
        return "/manage/productClass";
    }
    //添加分类
    @RequestMapping("ShowCategory")
    public String ShowCategory(Model model,DangdangProductCategory productCategory){
        categoryService.insert(productCategory);
        return "/manage/manage-result";
    }
    //删除分类
    @RequestMapping("DeleteCategory")
    public String DeleteCategory(Integer dpcParentId,Model model){
        categoryService.deleteByPrimaryKey(dpcParentId);
        return "/manage/manage-result";
    }
    //根据id产品标题
    @RequestMapping("update")
    public String update(Model model,Integer dpcId){
        DangdangProductCategory categories=categoryService.selectByPrimaryKey(dpcId);
        List<DangdangProductCategory> list=categoryService.selectByExample(null);
        model.addAttribute("list",list);
        model.addAttribute("categories",categories);
        return "/manage/productClass-modify";
    }
    @RequestMapping("updateCategory")
    public String updateCategory(DangdangProductCategory productCategory,Model model){
        categoryService.updateByPrimaryKeySelective(productCategory);
        return "/manage/manage-result";
    }
}
