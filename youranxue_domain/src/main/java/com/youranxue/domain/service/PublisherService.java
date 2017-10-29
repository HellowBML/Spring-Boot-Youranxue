package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.MyPublisher;



public interface PublisherService {

	List<MyPublisher> searchPublisherList(int publisherId);

	// List<Publisher> getPublisher(String bookId);

}
