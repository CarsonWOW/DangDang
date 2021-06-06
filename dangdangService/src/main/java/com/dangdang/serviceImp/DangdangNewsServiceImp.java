package com.dangdang.serviceImp;

import com.dangdang.mapper.DangdangNewsDao;
import com.dangdang.po.DangdangNews;
import com.dangdang.po.DangdangNewsExample;
import com.dangdang.service.DangdangNewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class DangdangNewsServiceImp implements DangdangNewsService {
    @Resource
    private DangdangNewsDao dangdangNewsDao;
    @Override
    public List<DangdangNews> selectByExample(DangdangNewsExample example) {
        return dangdangNewsDao.selectByExample(example);
    }

    @Override
    public DangdangNews selectByPrimaryKey(Integer dnId) {
        return dangdangNewsDao.selectByPrimaryKey(dnId);
    }

    @Override
    public int updateByPrimaryKeySelective(DangdangNews record) {
        return dangdangNewsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer dnId) {
        return dangdangNewsDao.deleteByPrimaryKey(dnId);
    }

    @Override
    public int insert(DangdangNews record) {
        return dangdangNewsDao.insert(record);
    }

}
