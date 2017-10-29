package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.MySection;



public interface SectionService {

	List<MySection> searchSectionList(int chapterId);

	// List<Section> getSection(String bookId);

}
