package com.dangdang.mapper;

import com.dangdang.po.DangdangShopping;
import com.dangdang.po.DangdangShoppingExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DangdangShoppingDao {
    long countByExample(DangdangShoppingExample example);

    int deleteByExample(DangdangShoppingExample example);

    int deleteByPrimaryKey(Integer dodId);

    int insert(DangdangShopping record);

    int insertSelective(DangdangShopping record);

    List<DangdangShopping> selectByExample(DangdangShoppingExample example);

    DangdangShopping selectByPrimaryKey(Integer dodId);

    int updateByExampleSelective(@Param("record") DangdangShopping record, @Param("example") DangdangShoppingExample example);

    int updateByExample(@Param("record") DangdangShopping record, @Param("example") DangdangShoppingExample example);

    int updateByPrimaryKeySelective(DangdangShopping record);

    int updateByPrimaryKey(DangdangShopping record);
}