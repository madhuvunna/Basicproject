package com.demo.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.school.Service.SchoolService;
import com.demo.school.entity.School;

@RestController
@RequestMapping("/api")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

//	@GetMapping
//	public ResponseEntity<School> getSchoolById(@PathVariable("id") Long SchoolId) {
//		School school = schoolService.getSchoolById(SchoolId);
//		return new ResponseEntity<>(school, HttpStatus.OK);
//
//	}
//
//	@PostMapping
//	public ResponseEntity<School> createSchool(@RequestBody School school) {
//		School saveSchool = schoolService.createSchool(school);
//		return new ResponseEntity<>(saveSchool, HttpStatus.CREATED);
//
//	}
	
	@GetMapping("/school")
	public List<School> findAll(){
	      return schoolService.findAll();
	   }

}
