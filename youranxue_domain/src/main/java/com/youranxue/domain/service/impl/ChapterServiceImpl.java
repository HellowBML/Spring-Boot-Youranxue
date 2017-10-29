package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youranxue.domain.entity.ChapterEntity;
import com.youranxue.domain.service.ChapterService;

import com.youranxue.domain.vo.MyChapter;

@Service
public class ChapterServiceImpl implements ChapterService {


	@Autowired
	private ChapterEntity chapterEntity;

	public List<MyChapter> searchChapterList(int gradeId) {

		List<MyChapter> chapterList = chapterEntity.searchChapterList(gradeId);

		
		int j = -2;
		List<MyChapter> rowChapterList = new ArrayList<>();
		for (MyChapter bk : chapterList) {
			if (j > 2) {
				j = -2;
				
				rowChapterList = new ArrayList<>();
			}

			j++;
			rowChapterList.add(bk);

		}
		
		return rowChapterList;
	}

}
