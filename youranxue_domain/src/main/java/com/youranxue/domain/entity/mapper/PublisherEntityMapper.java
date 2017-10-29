package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.MyPublisher;


public interface PublisherEntityMapper {
	List<MyPublisher> searchPublisherList(int bookId);
}
