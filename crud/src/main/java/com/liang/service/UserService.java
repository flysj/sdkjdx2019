package com.isoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.bean.User;
import com.isoft.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	/**
	 * 查询
	 * @return
	 */
	public List<User> getAll() {
		
		return userMapper.selectByExample(null);
	}

	/**
	 * 添加
	 * @return
	 */
	public void add(User user) {

		userMapper.insert(user);
	}

	/**
	 * 删除
	 * @return
	 */
	public void delete(int id) {
		
		userMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 修改
	 * @return
	 */
	public void update(User user) {

		userMapper.updateByPrimaryKey(user);
	}
	
}
