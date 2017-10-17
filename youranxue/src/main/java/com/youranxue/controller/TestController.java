package com.youranxue.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.db.User;

@RestController
public class TestController {




	@GetMapping("/secret")
	@CrossOrigin
	public User secretService() {


		User user = new User();
		user.setLastName("自动布置作业");
		user.setUsername("手动布置作业");
		user.setFirstName("admin.first");
		return user;
	}

}
