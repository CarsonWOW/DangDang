package com.dangdang.mapper;

import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DangdangProductCategoryDao {
    long countByExample(DangdangProductCategoryExample example);

    int deleteByExample(DangdangProductCategoryExample example);

    int deleteByPrimaryKey(Integer dpcId);

    int insert(DangdangProductCategory record);

    int insertSelective(DangdangProductCategory record);

    List<DangdangProductCategory> selectByExample(DangdangProductCategoryExample example);

    DangdangProductCategory selectByPrimaryKey(Integer dpcId);

    int updateByExampleSelective(@Param("record") DangdangProductCategory record, @Param("example") DangdangProductCategoryExample example);

    int updateByExample(@Param("record") DangdangProductCategory record, @Param("example") DangdangProductCategoryExample example);

    int updateByPrimaryKeySelective(DangdangProductCategory record);

    int updateByPrimaryKey(DangdangProductCategory record);
}