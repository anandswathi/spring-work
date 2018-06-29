package com.ran.sample.spring.service;

import java.util.List;

import com.ran.sample.spring.vo.StudentVO;

public interface StudentService {

	List<StudentVO> findByName(String name);
	StudentVO findById(Integer id);
	List<StudentVO> findAll();
	
	StudentVO save(StudentVO student);
	StudentVO update(StudentVO student);
	
	boolean delete(StudentVO student);
}
