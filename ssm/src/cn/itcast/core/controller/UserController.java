package cn.itcast.core.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 新增用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insert")
	public ModelAndView insertUser(String name,String birthday) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		
		User user = new User();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simpleDateFormat.parse(birthday);
		
		user.setName(name);
		user.setBirthday(date);
		System.out.println(user);
		
		userService.insertUser(user);
		
		modelAndView.setViewName("redirect:/list.action");
		return modelAndView;
	}
	/**
	 * 新增用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insert2")
	public ModelAndView insertUser2(User user) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(user);

		userService.insertUser(user);
		
		modelAndView.setViewName("redirect:/list.action");
		return modelAndView;
	}
	/**
	 * 跳转到新增用户页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toInsert")
	public ModelAndView toInsertUser() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/insert");
		return modelAndView;
	}
	/**
	 * 查询所有用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public ModelAndView findAllUser() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		List<User> users = userService.findAllUser();
		
		modelAndView.addObject("userList", users);
		modelAndView.setViewName("/list");
		return modelAndView;
	}
}
