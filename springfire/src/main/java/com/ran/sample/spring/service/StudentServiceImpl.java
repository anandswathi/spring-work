package com.ran.sample.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ran.sample.spring.vo.StudentVO;

@Service
public class StudentServiceImpl implements StudentService {
	private Map<Integer, StudentVO> testDB = new HashMap<Integer, StudentVO>();

	@Override
	public List<StudentVO> findByName(String name) {
		return null;
	}

	@Override
	public StudentVO findById(Integer id) {
		return testDB.get(id);
	}

	@Override
	public List<StudentVO> findAll() {
		return new ArrayList<StudentVO>(testDB.values());
	}

	@Override
	public StudentVO save(StudentVO student) {
		testDB.put(student.getId(), student);
		return student;
	}

	@Override
	public StudentVO update(StudentVO student) {
		testDB.put(student.getId(), student);
		return student;
	}

	@Override
	public boolean delete(StudentVO student) {
		testDB.remove(student);
		return true;
	}

}
