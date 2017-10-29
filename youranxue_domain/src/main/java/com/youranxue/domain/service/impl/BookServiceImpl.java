package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youranxue.domain.entity.BookEntity;
import com.youranxue.domain.service.BookService;
import com.youranxue.domain.vo.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookEntity bookEntity;

	public List<List<Book>> searchMyBookList(String userId) {

		List<Book> myBookList = bookEntity.searchMyBookList(userId);

		List<List<Book>> outList = new ArrayList<>();
		int j = 0;
		List<Book> rowBookList = new ArrayList<>();
		for (Book bk : myBookList) {
			if (j > 2) {
				j = 0;
				outList.add(rowBookList);
				rowBookList = new ArrayList<>();
			}

			j++;
			rowBookList.add(bk);

		}
		outList.add(rowBookList);
		return outList;
	}

//	@Override
//	public List<Chapter> serachChapterList(long bookId) {
//		bookEntity.setBookId(bookId);
//		return bookEntity.searchChapterList();
//	}

}
