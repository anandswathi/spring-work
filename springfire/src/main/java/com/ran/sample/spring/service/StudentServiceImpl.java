package com.ran.sample.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ran.sample.spring.dao.StudentDAO;
import com.ran.sample.spring.vo.StudentVO;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	private Map<Integer, StudentVO> testDB = new HashMap<Integer, StudentVO>();
	@Autowired
	private StudentDAO studentDao;
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
		//System.out.println(studentDao.findAll());
		return new ArrayList<StudentVO>(testDB.values());
	}

	@Override
	public StudentVO save(StudentVO student) {
		studentDao.save(student.toEntity());
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
