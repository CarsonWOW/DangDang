package com.dangdang.mapper;


import java.util.List;

import com.dangdang.po.DangdangUser;
import com.dangdang.po.DangdangUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DangdangUserDao {
    long countByExample(DangdangUserExample example);

    int deleteByExample(DangdangUserExample example);

    int deleteByPrimaryKey(Integer duUserId);

    int insert(DangdangUser record);

    int insertSelective(DangdangUser record);

    List<DangdangUser> selectByExample(DangdangUserExample example);

    DangdangUser selectByPrimaryKey(Integer duUserId);

    int updateByExampleSelective(@Param("record") DangdangUser record, @Param("example") DangdangUserExample example);

    int updateByExample(@Param("record") DangdangUser record, @Param("example") DangdangUserExample example);

    int updateByPrimaryKeySelective(DangdangUser record);

    int updateByPrimaryKey(DangdangUser record);
    //登录方法
    DangdangUser UserLogin(DangdangUser dangdangUser);
}