package com.chenlei.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.chenlei.entity.UserFormMap;
import com.chenlei.mapper.UserMapper;
import com.chenlei.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Inject
	UserMapper userMapper;
	
	public String sayMsg() {
		System.out.println("½øÈëservice²ã");
		List<UserFormMap> ls = userMapper.findUserPage(null);
		ls.forEach(o -> System.out.println(o.get("userName")));
		return null;
	}

}
