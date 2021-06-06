package com.dangdang.service;

import java.util.List;

import com.dangdang.po.DangdangProductCategory;
import com.dangdang.po.DangdangProductCategoryExample;
import com.dangdang.po.PageInfo;
import com.dangdang.po.User;
import org.apache.ibatis.annotations.Param;


public interface UserServcie {

	//添加
	public boolean insertUser(User user);
	//删除
	public boolean deleteUser(int id);
	//根据用户ID来查询用户信息
	public User findUserById(int id);
	//修改
	public int updateUserSet(User user);
	//分页查询
	public List<User> queryUserPage(User user, PageInfo info);
	//获取总条数
	public int queryUserCount(User user);
}
