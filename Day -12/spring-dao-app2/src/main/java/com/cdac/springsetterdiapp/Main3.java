package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.dto.User;
import com.cdac.springsetterdiapp.serv.UserService;



public class Main3 {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		UserService userService = (UserService)appCntx.getBean(UserService.class);
		userService.removeUser(3);
		
	}

}
