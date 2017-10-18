package com.youranxue.domain.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youranxue.domain.entity.mapper.GradeEntityMapper;
import com.youranxue.domain.model.GradeMst;
import com.youranxue.domain.stereotype.Entity;

import com.youranxue.domain.vo.MyGrade;




@Entity
@SuppressWarnings("serial")
public class GradeEntity extends GradeMst {

	@Autowired
	private GradeEntityMapper GradeEntityMapper;

	public List<MyGrade> searchGradeList(int publisherId) {
		return GradeEntityMapper.searchGradeList(publisherId);
	}
}
