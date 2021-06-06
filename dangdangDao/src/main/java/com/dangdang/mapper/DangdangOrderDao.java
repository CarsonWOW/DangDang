package com.dangdang.mapper;

import com.dangdang.po.DangdangOrder;
import com.dangdang.po.DangdangOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DangdangOrderDao {
    long countByExample(DangdangOrderExample example);

    int deleteByExample(DangdangOrderExample example);

    int deleteByPrimaryKey(Integer doId);

    int insert(DangdangOrder record);

    int insertSelective(DangdangOrder record);

    List<DangdangOrder> selectByExample(DangdangOrderExample example);

    DangdangOrder selectByPrimaryKey(Integer doId);

    int updateByExampleSelective(@Param("record") DangdangOrder record, @Param("example") DangdangOrderExample example);

    int updateByExample(@Param("record") DangdangOrder record, @Param("example") DangdangOrderExample example);

    int updateByPrimaryKeySelective(DangdangOrder record);

    int updateByPrimaryKey(DangdangOrder record);
}