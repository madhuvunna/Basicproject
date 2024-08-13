package com.demo.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
