package com.dangdang.serviceImp;

import com.dangdang.po.Car;
import com.dangdang.po.CarItems;
import com.dangdang.service.ShopCarService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑层
 */
@Service
public class ShopCarServiceImp implements ShopCarService {
    //商品条目
    @Override
    public List<CarItems> addCarItems(Car car, CarItems carItems) {
        //把所有购物车中商品集合查询出来
        List<CarItems> list = car.getList();
        for (int i=0;i<list.size();i++){
            //将每次查询出来的CarItems存入
            CarItems c=list.get(i);
            //判断
            if (c.getProduct().getDpId().equals(carItems.getProduct().getDpId())){
                //判断,如果之前添加过此商品,在添加,在数量加1
                c.setNum(c.getNum()+1);
                //修改list中的值
                list.set(i,c);
                return list;
            }
            //如果没有查询出数据,说明是第一次添加,则需要将CarItems存入list
        }
        list.add(carItems);
        return list;
    }

    @Override
    //计算总价格
    public double account(Car car) {
        //把所有购物车中商品集合查询出来
        List<CarItems> list = car.getList();
        double account=0;
        for (CarItems c:list){
            double price=c.getNum()*c.getProduct().getDpPrice().longValue();
            account+=price;
        }
        return account;
    }

    @Override
    //修改数量
    public List<CarItems> updateNum(Car car, int num, Integer dpId) {
        //把所有购物车中商品集合查询出来
        List<CarItems> list = car.getList();
        //循环
        for (int i=0;i<list.size();i++){
            CarItems c=list.get(i);
            //判断,如果前端传递过来的dpId,与产品ID相等,则修改数量
            if (c.getProduct().getDpId().equals(dpId)){
                c.setNum(num);
                list.set(i,c);
                return list;
            }
        }

        return list;
    }
}
