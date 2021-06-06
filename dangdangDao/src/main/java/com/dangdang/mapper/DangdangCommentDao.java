package com.dangdang.mapper;


import java.util.List;

import com.dangdang.po.DangdangComment;
import com.dangdang.po.DangdangCommentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DangdangCommentDao {
    long countByExample(DangdangCommentExample example);

    int deleteByExample(DangdangCommentExample example);

    int deleteByPrimaryKey(Integer duId);

    int insert(DangdangComment record);

    int insertSelective(DangdangComment record);

    List<DangdangComment> selectByExample(DangdangCommentExample example);

    DangdangComment selectByPrimaryKey(Integer duId);

    int updateByExampleSelective(@Param("record") DangdangComment record, @Param("example") DangdangCommentExample example);

    int updateByExample(@Param("record") DangdangComment record, @Param("example") DangdangCommentExample example);

    int updateByPrimaryKeySelective(DangdangComment record);

    int updateByPrimaryKey(DangdangComment record);
    int Commentinsert(DangdangComment record);
}