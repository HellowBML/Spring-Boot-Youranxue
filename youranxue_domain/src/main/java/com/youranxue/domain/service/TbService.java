package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.MyTb;



public interface TbService {

	List<MyTb> searchTbList(String userId);

	// List<Tb> getTb(String bookId);

}
