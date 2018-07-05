package com.ran.sample.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.ran.sample.spring.entity.StudentEntity;

@Repository
public class StudenDAOImpl implements StudentDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<StudentEntity> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentEntity> findAll() {
		CriteriaQuery<StudentEntity> criteriaQuery = em.getCriteriaBuilder().createQuery(StudentEntity.class);
		@SuppressWarnings("unused")
		Root<StudentEntity> root = criteriaQuery.from(StudentEntity.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public StudentEntity save(StudentEntity student) {
		em.persist(student);
		return student;
	}

	@Override
	public StudentEntity update(StudentEntity student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(StudentEntity student) {
		// TODO Auto-generated method stub
		return false;
	}

}
