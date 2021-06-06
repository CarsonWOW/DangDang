package com.dangdang.action;

import com.dangdang.po.Car;
import com.dangdang.po.CarItems;
import com.dangdang.po.DangdangProduct;
import com.dangdang.service.DangDangProductService;
import com.dangdang.service.ShopCarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/Car")
public class ShopCarAction {
    @Resource
    private ShopCarService shopCarService;
    @Resource
    private DangDangProductService productService;
    //跳转到购物车
    @RequestMapping("CarAdd")
    public String CarAdd(HttpSession session, Model model,Integer dpId){
        //第一步,先根据前端传来的id,查询出商品的信息
        DangdangProduct dangdangProduct=productService.selectByPrimaryKey(dpId);
        //获取session中的Car
        Car car = (Car) session.getAttribute("car");
        //3.判断 session是否为空，如果为空则创建,新的对象
        if (car==null){
            car=new Car();
        }
        CarItems carItems=new CarItems();
        //将根据id查询出来的对象传递给CarItems
        carItems.setProduct(dangdangProduct);
        carItems.setNum(1);
        //4创建商品条目集合
        List<CarItems> carItemsList=shopCarService.addCarItems(car,carItems);
        //5存入购物车
        car.setList(carItemsList);
        //6计算总价格
        double count=shopCarService.account(car);
        //7将count存入car
        car.setAccount(count);
        //8.存入作用域中,前台获取值
        session.setAttribute("car",car);
        return "shopping";
    }
    //修改购物车数量
    @RequestMapping("/update")
    public void update(int num, Integer dpId, HttpSession session, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        //获取session中的car
        Car car=(Car)session.getAttribute("car");
        //调用业务层修改方法
        List<CarItems> carItems=shopCarService.updateNum(car,num,dpId);
        //调用修改方法后,将修改后的对象,存入购物车
        car.setList(carItems);
        //在计算总价格
        double account=shopCarService.account(car);
        //把account存入car中
        car.setAccount(account);
        //6.把car存入session
        session.removeAttribute("car");
        session.setAttribute("car", car);
        out.print("购物车修改成功");
    }
}
