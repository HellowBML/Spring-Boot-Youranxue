package com.youranxue.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.TbEntityMapper;
import com.youranxue.domain.stereotype.Entity;
import com.youranxue.domain.model.BookMst;
import com.youranxue.domain.vo.MyTb;

@Entity
@SuppressWarnings("serial")
public class TbEntity extends BookMst {

	@Autowired
	private TbEntityMapper TbEntityMapper;

	public List<MyTb> searchTbList(String userId) {
		return TbEntityMapper.searchTbList(userId);
	}
}
