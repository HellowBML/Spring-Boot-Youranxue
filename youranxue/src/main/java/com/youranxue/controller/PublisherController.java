package com.youranxue.controller;

import java.util.List;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.service.PublisherService;

import com.youranxue.domain.vo.MyPublisher;


@RestController
public class PublisherController {

	@Autowired
	private PublisherService PublisherService;

	private static Logger log = Logger.getLogger(PublisherController.class);




	@GetMapping("/publisher")
	@CrossOrigin
	public List<MyPublisher> getPublisher() {

		return PublisherService.searchPublisherList(1002);
	}

}
