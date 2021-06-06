package com.dangdang.service;

import java.util.List;

import javax.annotation.Resource;

import com.dangdang.mapper.DangdangProductCategoryDao;
import com.dangdang.mapper.UserMapper;
import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;
import com.dangdang.po.PageInfo;
import com.dangdang.po.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class UserServcieImpl implements UserServcie {

	@Resource
	private UserMapper userMapper;


	//添加
	public boolean insertUser(User user){
		return userMapper.insertUser(user);
	}
	//删除
	public boolean deleteUser(int id){
		return userMapper.deleteUser(id);
	}
	//根据用户ID来查询用户信息
	public User findUserById(int id){
		return userMapper.findUserById(id);
	}
	//修改
	public int updateUserSet(User user){
		return userMapper.updateUserSet(user);
	}
	//分页查询
	public List<User> queryUserPage(User user, PageInfo info){
		//开始
		int begin = (info.getCurrPageNo()-1)* info.getPageSize();
		//结束
		int end = begin+info.getPageSize();
		System.out.println("开始"+begin);
		System.out.println("end"+end);
		return userMapper.queryUserPage(user, begin, end);
	}
	//获取总条数
	public int queryUserCount(User user){
		return userMapper.queryUserCount(user);
	}
}
