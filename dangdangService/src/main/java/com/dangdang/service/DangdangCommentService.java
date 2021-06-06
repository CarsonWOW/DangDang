package com.dangdang.service;

import com.dangdang.po.DangdangComment;
import com.dangdang.po.DangdangCommentExample;

import java.util.List;

/**
 * 留言业务层接口
 */
public interface DangdangCommentService {
    //查询所有留言信息
    List<DangdangComment> selectByExample(DangdangCommentExample example);
    //添加留言信息
    int Commentinsert(DangdangComment record);
    //后台根据id查询留言信息
    DangdangComment selectByPrimaryKey(Integer duId);
    //修改回复信息,就是后台回复
    int updateByPrimaryKeySelective(DangdangComment record);
}
