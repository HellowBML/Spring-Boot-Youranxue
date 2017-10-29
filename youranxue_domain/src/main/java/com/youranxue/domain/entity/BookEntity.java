package com.youranxue.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.BookEntityMapper;
import com.youranxue.domain.stereotype.Entity;
import com.youranxue.domain.vo.Book;
import com.youranxue.domain.model.BookMst;
@Entity
public class BookEntity {

	private BookMst bookMst;

	@Autowired
	private BookEntityMapper bookEntityMapper;

	// @Autowired
	// private ChapterMstMapper chapterMstMapper;
	//
	// @Autowired
	// private SectionMstMapper sectionMstMapper;

	public List<Book> searchMyBookList(String userId) {

		return bookEntityMapper.searchMyBookList(userId);
	}

	// public List<Chapter> searchChapterList() {
	// List<Chapter> chapterList =
	// chapterEntityMapper.searchChapterListByBookId(bookId);
	//
	// chapterList.forEach(chapter -> {
	// List<Section> sectionList =
	// sectionEntityMapper.searchSectionListByChapterId(chapter.getChapterId());
	// chapter.setSectionList(sectionList);
	// });
	//
	// return chapterList;
	// }
}
