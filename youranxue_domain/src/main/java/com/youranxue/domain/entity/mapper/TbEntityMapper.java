package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.MyTb;


public interface TbEntityMapper {
	List<MyTb> searchTbList(String userId);
}
