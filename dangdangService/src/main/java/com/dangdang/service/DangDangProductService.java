package com.dangdang.service;

import com.dangdang.po.DangdangProduct;
import com.dangdang.po.DangdangProductExample;

import java.util.List;

public interface DangDangProductService {
    //点击查询商品信息
    List<DangdangProduct> QueryProductByChildID(DangdangProduct product,Integer dpcParentId);
    //添加商品
    int insert(DangdangProduct product);
    //根据id查询商品信息
    DangdangProduct selectByPrimaryKey(Integer dpId);;
}
