package com.ran.sample.spring.dao;

import java.util.List;

import com.ran.sample.spring.entity.StudentEntity;

public interface  StudentDAO {
	List<StudentEntity> findByName(String name);
	StudentEntity findById(Integer id);
	List<StudentEntity> findAll();
	
	StudentEntity save(StudentEntity student);
	StudentEntity update(StudentEntity student);
	
	boolean delete(StudentEntity student);
}
