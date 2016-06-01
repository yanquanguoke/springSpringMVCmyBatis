package com.chenlei.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenlei.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/sayMsg")
	public Map<String,Object> sayMsg(HttpServletRequest res){
		System.out.println("Æô¶¯³É¹¦£¡");
		userService.sayMsg();
		return null;
	}

}
