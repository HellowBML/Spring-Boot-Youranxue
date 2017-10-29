package com.youranxue.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.ChapterEntityMapper;
import com.youranxue.domain.stereotype.Entity;
import com.youranxue.domain.model.ChapterMst;
import com.youranxue.domain.vo.MyChapter;

@Entity
@SuppressWarnings("serial")
public class ChapterEntity extends ChapterMst {

	@Autowired
	private ChapterEntityMapper chapterEntityMapper;

	public List<MyChapter> searchChapterList(int gradeId) {
		return chapterEntityMapper.searchChapterList(gradeId);
	}
}
