package com.youranxue.domain.service;

import java.util.List;

import com.youranxue.domain.vo.MyGrade;



public interface GradeService {

	List<MyGrade> searchGradeList(int PublisherId);


}
