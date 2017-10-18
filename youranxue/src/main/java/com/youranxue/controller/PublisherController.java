package com.youranxue.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.db.Publisher;

@RestController
public class PublisherController {





	@GetMapping("/publisher")
	@CrossOrigin
	public Publisher secretService() {


		Publisher publisher = new Publisher();
		publisher.setPublisher_id("自动布置作业");
		publisher.setPublisher_name("手动布置作业");
		publisher.setBook_id("教材版本");
		return publisher;
	}

}
