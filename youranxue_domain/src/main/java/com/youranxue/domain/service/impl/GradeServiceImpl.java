package com.youranxue.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.youranxue.domain.entity.GradeEntity;
import com.youranxue.domain.service.GradeService;

import com.youranxue.domain.vo.MyGrade;



@Service
public class GradeServiceImpl implements GradeService {


	@Autowired
	private GradeEntity GradeEntity;

	public List<MyGrade> searchGradeList(int PublisherId) {

		List<MyGrade> GradeList = GradeEntity.searchGradeList(PublisherId);


		int j = -4;
		List<MyGrade> rowGradeList = new ArrayList<>();
		for (MyGrade bk : GradeList) {
			if (j > 2) {
				j = -4;

				rowGradeList = new ArrayList<>();
			}

			j++;
			rowGradeList.add(bk);

		}

		return rowGradeList;
	}

}
