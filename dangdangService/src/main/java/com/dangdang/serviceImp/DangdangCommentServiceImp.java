package com.dangdang.serviceImp;

import com.dangdang.mapper.DangdangCommentDao;
import com.dangdang.po.DangdangComment;
import com.dangdang.po.DangdangCommentExample;
import com.dangdang.service.DangdangCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DangdangCommentServiceImp implements DangdangCommentService {
    @Resource
    private DangdangCommentDao commentDao;
    @Override
    public List<DangdangComment> selectByExample(DangdangCommentExample example) {
        return commentDao.selectByExample(example);
    }

    @Override
    public int Commentinsert(DangdangComment record) {
        return commentDao.Commentinsert(record);
    }

    @Override
    public DangdangComment selectByPrimaryKey(Integer duId) {
        return commentDao.selectByPrimaryKey(duId);
    }

    @Override
    public int updateByPrimaryKeySelective(DangdangComment record) {
        return commentDao.updateByPrimaryKeySelective(record);
    }
}
