package com.youranxue.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.service.GradeService;

import com.youranxue.domain.vo.MyGrade;

@RestController
public class GradeController {


	@Autowired
	private GradeService GradeService;

	private static Logger log = Logger.getLogger(GradeController.class);


	@GetMapping("/grade")
	@CrossOrigin
	public List<MyGrade> getGrade() {

		return GradeService.searchGradeList(3001);

//		public List<MyGrade> getGradeList() {
//		MyGrade myGrade1 = new MyGrade();
//			myGrade1.setGradeId(1001);
//			myGrade1.setGradeName("一年级");
//
//			MyGrade myGrade2 = new MyGrade();
//			myGrade2.setGradeId(1002);
//			myGrade2.setGradeName("二年级");
//
//			MyGrade myGrade3 = new MyGrade();
//			myGrade3.setGradeId(1003);
//			myGrade3.setGradeName("三年级");
//
//			List<MyGrade> gradeList = new ArrayList<MyGrade>();
//			gradeList.add(myGrade1);
//			gradeList.add(myGrade2);
//			gradeList.add(myGrade3);
//
//			return gradeList;

	}

}
