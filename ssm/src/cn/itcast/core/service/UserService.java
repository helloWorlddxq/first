package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserService {

	public List<User> findAllUser() throws Exception;

	public void insertUser(User user) throws Exception;
}
