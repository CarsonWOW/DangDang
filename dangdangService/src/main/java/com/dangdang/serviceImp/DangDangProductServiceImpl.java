package com.dangdang.serviceImp;

import com.dangdang.mapper.DangdangProductDao;
import com.dangdang.po.DangdangProduct;
import com.dangdang.service.DangDangProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class DangDangProductServiceImpl implements DangDangProductService {
    @Resource
    private DangdangProductDao productDao;
    @Override
    public List<DangdangProduct> QueryProductByChildID(DangdangProduct product, Integer dpcParentId) {
        return productDao.QueryProductByChildID(product,dpcParentId);
    }

    @Override
    public int insert(DangdangProduct product) {
        return productDao.insert(product);
    }

    @Override
    public DangdangProduct selectByPrimaryKey(Integer dpId) {
        return productDao.selectByPrimaryKey(dpId);
    }
}
