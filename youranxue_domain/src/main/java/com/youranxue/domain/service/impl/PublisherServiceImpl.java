package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youranxue.domain.entity.PublisherEntity;
import com.youranxue.domain.service.PublisherService;

import com.youranxue.domain.vo.MyPublisher;

@Service
public class PublisherServiceImpl implements PublisherService {


	@Autowired
	private PublisherEntity PublisherEntity;

	public List<MyPublisher> searchPublisherList(int bookId) {

		List<MyPublisher> PublisherList = PublisherEntity.searchPublisherList(bookId);

		
		int j = -2;
		List<MyPublisher> rowPublisherList = new ArrayList<>();
		for (MyPublisher bk : PublisherList) {
			if (j > 2) {
				j = -2;
				
				rowPublisherList = new ArrayList<>();
			}

			j++;
			rowPublisherList.add(bk);

		}
		
		return rowPublisherList;
	}

}
