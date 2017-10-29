package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.MySection;


public interface SectionEntityMapper {
	List<MySection> searchSectionList(int chapterId);
}
