package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.MyChapter;



public interface ChapterService {

	List<MyChapter> searchChapterList(int gradeId);

	// List<Chapter> getChapter(String bookId);

}
