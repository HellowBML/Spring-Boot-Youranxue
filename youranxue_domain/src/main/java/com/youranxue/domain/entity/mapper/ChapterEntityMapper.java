package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.MyChapter;


public interface ChapterEntityMapper {
	List<MyChapter> searchChapterList(int gradeId);
}
