package com.dangdang.serviceImp;

import com.dangdang.mapper.DangdangUserDao;
import com.dangdang.po.DangdangUser;
import com.dangdang.po.DangdangUserExample;
import com.dangdang.service.DangDangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DangDangUserServiceImp implements DangDangUserService {
    @Autowired
    private DangdangUserDao dangdangUserDao;
    @Override
    public DangdangUser UserLogin(DangdangUser dangdangUser) {
        return dangdangUserDao.UserLogin(dangdangUser);
    }

    @Override
    public int insert(DangdangUser dangdangUser) {
        return dangdangUserDao.insert(dangdangUser);
    }

    @Override
    public List<DangdangUser> selectByExample(DangdangUserExample example) {
        return dangdangUserDao.selectByExample(example);
    }

    @Override
    public DangdangUser selectByPrimaryKey(Integer duUserId) {
        return dangdangUserDao.selectByPrimaryKey(duUserId);
    }

    @Override
    public int updateByPrimaryKeySelective(DangdangUser record) {
        return dangdangUserDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer duUserId) {
        return dangdangUserDao.deleteByPrimaryKey(duUserId);
    }
}
