package com.dangdang.service;

import com.dangdang.po.DangdangUser;
import com.dangdang.po.DangdangUserExample;

import java.util.List;

public interface DangDangUserService {
    //登录方法
    DangdangUser UserLogin(DangdangUser dangdangUser);
    //注册
    int insert(DangdangUser dangdangUser);
    //查询用户
    List<DangdangUser> selectByExample(DangdangUserExample example);
    //根据Id查询
    DangdangUser selectByPrimaryKey(Integer duUserId);
    //根据id查询在修改
    int updateByPrimaryKeySelective(DangdangUser record);
    //删除
    int deleteByPrimaryKey(Integer duUserId);
}
