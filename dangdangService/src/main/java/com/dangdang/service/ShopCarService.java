package com.dangdang.service;

import com.dangdang.po.Car;
import com.dangdang.po.CarItems;

import java.util.List;

/**
 * 购物车接口
 */
public interface ShopCarService {
    //添加到购物车
    public List<CarItems> addCarItems(Car car, CarItems carItems);
    //计算总价格
    public double account(Car car);
    //修改购物车数量,传三个参数,一个是数量,修改的产品id,一个对象
    public List<CarItems> updateNum(Car car,int num,Integer dpId);
}
