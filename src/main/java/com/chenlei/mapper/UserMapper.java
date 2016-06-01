package com.chenlei.mapper;

import java.util.List;

import com.chenlei.entity.UserFormMap;


public interface UserMapper extends BasicMapper {
	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
}
