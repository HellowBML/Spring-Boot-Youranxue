package com.youranxue.domain.entity;

import java.util.List;

import com.youranxue.domain.model.PublisherMst;
import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.PublisherEntityMapper;
import com.youranxue.domain.stereotype.Entity;

import com.youranxue.domain.vo.MyPublisher;

@Entity
@SuppressWarnings("serial")
public class PublisherEntity extends PublisherMst {

	@Autowired
	private PublisherEntityMapper PublisherEntityMapper;

	public List<MyPublisher> searchPublisherList(int bookId) {
		return PublisherEntityMapper.searchPublisherList(bookId);
	}
}
