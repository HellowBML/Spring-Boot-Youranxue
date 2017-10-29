package com.youranxue.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.SectionEntityMapper;

import com.youranxue.domain.stereotype.Entity;
import com.youranxue.domain.model.SectionMst;
import com.youranxue.domain.vo.MySection;

@Entity
@SuppressWarnings("serial")
public class SectionEntity extends SectionMst {

	@Autowired
	private SectionEntityMapper SectionEntityMapper;

	public List<MySection> searchSectionList(int chapterId) {
		return SectionEntityMapper.searchSectionList(chapterId);
	}
}
