package com.dangdang.service;

import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;

import java.util.List;

public interface DangDangProductCategoryService {
    //产品标题
    List<DangdangProductCategory> selectByExample(DangdangProductCategoryExample example);
    //添加产品标题
    int insert(DangdangProductCategory record);
    //删除产品标题
    int deleteByPrimaryKey(Integer dpcId);
    //修改产品标题
    int updateByPrimaryKeySelective(DangdangProductCategory record);
    //根据id查询
    DangdangProductCategory selectByPrimaryKey(Integer dpcId);
}
