package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youranxue.domain.entity.SectionEntity;
import com.youranxue.domain.service.SectionService;

import com.youranxue.domain.vo.MySection;

@Service
public class SectionServiceImpl implements SectionService {


	@Autowired
	private SectionEntity SectionEntity;

	public List<MySection> searchSectionList(int chapterId) {

		List<MySection> SectionList = SectionEntity.searchSectionList(chapterId);

		
		int j = -2;
		List<MySection> rowSectionList = new ArrayList<>();
		for (MySection bk : SectionList) {
			if (j > 2) {
				j = -2;
				
				rowSectionList = new ArrayList<>();
			}

			j++;
			rowSectionList.add(bk);

		}
		
		return rowSectionList;
	}

}
