package com.isoft.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isoft.bean.User;
import com.isoft.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	/**
	 * 查询用户信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/getUser")
	public String getUser(Map<Object, Object> map) {
		
		List<User> list=userService.getAll();
		
		map.put("lists", list);
		
		System.out.println(list);
		return "list";
		
	}
	
	
	/**
	 * 新增用户信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user) {
		
		System.out.println("添加");
		System.out.println(user.getUsername());
		
		userService.add(user);
		
		return "redirect:/index.jsp";//重定向
	}
	
	
	/**
	 * 删除用户信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		
		System.out.println("删除"+id);
		
		userService.delete(id);
		
		return "redirect:/index.jsp";//重定向
	}
	
	
	/**
	 * 修改用户信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		
		System.out.println("修改");
		
		userService.update(user);
		
		return "redirect:/index.jsp";//重定向
	}
	
}
