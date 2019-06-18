package com.isoft.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isoft.bean.User;
import com.isoft.dao.UserMapper;

/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UserMapper userMapper;
	
	/**
	 * 测试UserMapper
	 */
	@Test
	public void testCRUD(){
		
		System.out.println(userMapper);
		
		//1、插入几个部门
		userMapper.insertSelective(new User(null,"马亮","123456","924818949@qq.com"));
		//userMapper.insertSelective(new User(null,"张丽娜","321","1219241473@qq.com"));
		
//		List<User> list= userMapper.selectByExample(null);
//		
//		for (User user : list) {
//			System.out.println(user.getUsername());
//			System.out.println(user.getPassword());
//		}
//		
		
	}

}
