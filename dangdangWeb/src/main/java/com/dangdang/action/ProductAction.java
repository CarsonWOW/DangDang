package com.dangdang.action;

import com.dangdang.po.DangdangProduct;
import com.dangdang.service.DangDangProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/Product")
public class ProductAction {
    @Resource
    private DangDangProductService dangDangProductService;
    //前台商品查询
    @RequestMapping("QueryAll")
    public String QueryAll(Integer dpcParentId, DangdangProduct product, Model model){
        List<DangdangProduct> ProductList=dangDangProductService.QueryProductByChildID(product,dpcParentId);
        model.addAttribute("ProductList",ProductList);
        return "index";
    }
    //后台商品管理
    @RequestMapping("queryAllManage")
    public String queryAllManage(Model model, HttpSession session,Integer PageNow){
        //如果当前页没有值,则设为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //分页查询,PageNow,当前第几页,pageSize,一页显示多少条
        PageHelper.startPage(PageNow,3);
        List<DangdangProduct> ProductList=dangDangProductService.QueryProductByChildID(null,null);
        PageInfo<DangdangProduct> productPageInfo=new PageInfo<DangdangProduct>(ProductList);
        model.addAttribute("pList", productPageInfo.getList());
        model.addAttribute("pageInfo",productPageInfo);
        return "manage/product";
    }
    //前台商品查询分页:没做完整
    @RequestMapping("ProductList")
    public String ProductList(DangdangProduct product, Model model,Integer PageNow){
        //如果当前页没有值,则设为第1页
        if (PageNow==null){
            PageNow=1;
        }
        //分页查询,PageNow,当前第几页,pageSize,一页显示多少条
        PageHelper.startPage(PageNow,3);
        List<DangdangProduct> list=dangDangProductService.QueryProductByChildID(product,null);
        PageInfo<DangdangProduct> productPageInfo=new PageInfo<DangdangProduct>(list);
        model.addAttribute("pList", productPageInfo.getList());
        model.addAttribute("pageInfo",productPageInfo);;
        return "product-list";
    }
    //添加商品
    @RequestMapping("AddProduct")
    public String AddProduct(@RequestParam(value = "file",required = false) CommonsMultipartFile file
    , HttpServletRequest request,Model model,DangdangProduct product) throws IOException {
        /**
         * 上传图片
         */
        //D:\BaiduNetdiskDownload\Java\ideaPro\DangDangTest\dangdangWeb\src\main\webapp\images\product
        //获取原始图片的拓展名
        /*String fileName = "";*/
        //图片上传成功后，将图片的地址写到数据库

        String filePath = "D:\\BaiduNetdiskDownload\\Java\\ideaPro\\DangDangTest\\dangdangWeb\\src\\main\\webapp\\images\\product";//保存图片的路径
        //获取原始图片的拓展名
        String originalFilename = file.getOriginalFilename();
        //新的文件名字
        String newFileName = UUID.randomUUID()+originalFilename;
        //封装上传文件位置的全路径
        File targetFile = new File(filePath,newFileName);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetFile);
        product.setDpFileName(newFileName);
       /* //判断文件是否为空
        if (!multi.isEmpty()){
            //获取文件名
            fileName=multi.getOriginalFilename();
            String path = request.getSession().getServletContext().getRealPath("/images/product");
            System.out.println(path);
            File file = new File(path,fileName);
            //上传
            try {
                multi.transferTo(file);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        product.setDpFileName(fileName);
        System.out.println("上传成功的文件名:"+product.getDpFileName());*/
        int i=dangDangProductService.insert(product);
        return "forward:/rest/Product/queryAllManage";

    }



}
