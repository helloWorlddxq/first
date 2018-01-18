package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserDao {
	
	public List<User> findAllUser() throws Exception;

	public void insertUser(User user);
}
