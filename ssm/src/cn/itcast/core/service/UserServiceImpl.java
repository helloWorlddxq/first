package cn.itcast.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserDao;
import cn.itcast.core.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	/**
	 * 查询所有用户
	 */
	@Override
	public List<User> findAllUser() throws Exception {
		return userDao.findAllUser();
	}
	/**
	 * 新增用户
	 */
	@Override
	public void insertUser(User user) throws Exception {
		userDao.insertUser(user);
	}

}
