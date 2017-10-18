package com.youranxue.domain.entity.mapper;

import java.util.List;

import com.youranxue.domain.vo.MyGrade;

public interface GradeEntityMapper {
	List<MyGrade> searchGradeList(int publisherId);
}
