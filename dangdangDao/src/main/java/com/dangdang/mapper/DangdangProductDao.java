package com.dangdang.mapper;

import com.dangdang.po.DangdangProduct;
import com.dangdang.po.DangdangProductExample;
import com.sun.imageio.plugins.common.I18N;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DangdangProductDao {
    //点击查询商品信息
    List<DangdangProduct> QueryProductByChildID(@Param("product") DangdangProduct product,@Param("dpcParentId") Integer dpcParentId);
    long countByExample(DangdangProductExample example);

    int deleteByExample(DangdangProductExample example);

    int deleteByPrimaryKey(Integer dpId);

    int insert(DangdangProduct record);

    int insertSelective(DangdangProduct record);

    List<DangdangProduct> selectByExample(DangdangProductExample example);

    DangdangProduct selectByPrimaryKey(Integer dpId);

    int updateByExampleSelective(@Param("record") DangdangProduct record, @Param("example") DangdangProductExample example);

    int updateByExample(@Param("record") DangdangProduct record, @Param("example") DangdangProductExample example);

    int updateByPrimaryKeySelective(DangdangProduct record);

    int updateByPrimaryKey(DangdangProduct record);
}