package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youranxue.domain.entity.TbEntity;
import com.youranxue.domain.service.TbService;

import com.youranxue.domain.vo.MyTb;

@Service
public class TbServiceImpl implements TbService {


	@Autowired
	private TbEntity TbEntity;

	public List<MyTb> searchTbList(String userId) {

		List<MyTb> TbList = TbEntity.searchTbList(userId);

		
		int j = -2;
		List<MyTb> rowTbList = new ArrayList<>();
		for (MyTb bk : TbList) {
			if (j > 2) {
				j = -2;
				
				rowTbList = new ArrayList<>();
			}

			j++;
			rowTbList.add(bk);

		}
		
		return rowTbList;
	}

}
