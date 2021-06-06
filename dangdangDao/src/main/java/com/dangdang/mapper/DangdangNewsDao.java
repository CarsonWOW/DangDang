package com.dangdang.mapper;


import java.util.List;

import com.dangdang.po.DangdangNews;
import com.dangdang.po.DangdangNewsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DangdangNewsDao {
    long countByExample(DangdangNewsExample example);

    int deleteByExample(DangdangNewsExample example);

    int deleteByPrimaryKey(Integer dnId);

    int insert(DangdangNews record);

    int insertSelective(DangdangNews record);

    List<DangdangNews> selectByExample(DangdangNewsExample example);

    DangdangNews selectByPrimaryKey(Integer dnId);

    int updateByExampleSelective(@Param("record") DangdangNews record, @Param("example") DangdangNewsExample example);

    int updateByExample(@Param("record") DangdangNews record, @Param("example") DangdangNewsExample example);

    int updateByPrimaryKeySelective(DangdangNews record);

    int updateByPrimaryKey(DangdangNews record);
}