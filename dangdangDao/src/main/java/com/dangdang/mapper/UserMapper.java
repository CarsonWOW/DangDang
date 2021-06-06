package com.dangdang.mapper;

import com.dangdang.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
	//添加
	public boolean insertUser(User user);
	//删除
	public boolean deleteUser(int id);
	//根据用户ID来查询用户信息
	public User findUserById(int id);
	//修改
	public int updateUserSet(User user);
	//分页查询
	public List<User> queryUserPage(@Param("user") User user, @Param("begin") int begin, @Param("end") int end);
	//获取总条数
	public int queryUserCount(@Param("user") User user);
}
