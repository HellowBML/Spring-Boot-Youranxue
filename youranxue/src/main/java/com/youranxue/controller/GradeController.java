package com.youranxue.controller;

import java.util.List;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	}

}
