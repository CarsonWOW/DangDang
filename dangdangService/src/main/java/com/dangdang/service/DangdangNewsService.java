package com.dangdang.service;

import com.dangdang.po.DangdangNews;
import com.dangdang.po.DangdangNewsExample;

import java.util.List;

public interface DangdangNewsService {
    List<DangdangNews> selectByExample(DangdangNewsExample example);
    DangdangNews selectByPrimaryKey(Integer dnId);
    int updateByPrimaryKeySelective(DangdangNews record);
    int deleteByPrimaryKey(Integer dnId);
    int insert(DangdangNews record);
}
