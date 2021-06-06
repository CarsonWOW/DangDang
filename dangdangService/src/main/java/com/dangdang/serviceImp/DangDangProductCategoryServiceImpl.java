package com.dangdang.serviceImp;

import com.dangdang.mapper.DangdangProductCategoryDao;
import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;
import com.dangdang.service.DangDangProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DangDangProductCategoryServiceImpl implements DangDangProductCategoryService {
    @Resource
    private DangdangProductCategoryDao categoryDao;
    @Override
    public List<DangdangProductCategory> selectByExample(DangdangProductCategoryExample example) {
        return categoryDao.selectByExample(example);
    }

    @Override
    public int insert(DangdangProductCategory record) {
        return categoryDao.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer dpcId) {
        return categoryDao.deleteByPrimaryKey(dpcId);
    }

    @Override
    public int updateByPrimaryKeySelective(DangdangProductCategory record) {
        return categoryDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public DangdangProductCategory selectByPrimaryKey(Integer dpcId) {
        return categoryDao.selectByPrimaryKey(dpcId);
    }
}
