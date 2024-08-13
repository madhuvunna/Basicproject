package com.demo.school.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.school.dao.SchoolRepository;
import com.demo.school.entity.School;

@Service
public class SchoolSerivceImpl implements SchoolService {

	private SchoolRepository schoolRepository;

	@Override
	public List<School> findAll() {
		return null;
	}

	

//	@Override
//	public School createSchool(School school) {
//
//		return schoolRepository.save(school);
//	}
//
//	@Override
//	public School getSchoolById(Long SchoolId) {
//		Optional<School> OptionalUser = schoolRepository.findById(SchoolId);
//		return OptionalUser.get();
//	}

}
