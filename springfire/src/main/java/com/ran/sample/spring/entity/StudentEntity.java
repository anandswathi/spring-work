package com.ran.sample.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ran.sample.spring.vo.StudentVO;

@Entity
@Table(name = "student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String contactNumber;
	@Column
	private Integer rollNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public StudentVO toVo() {
		StudentVO studentVo = new 		StudentVO();
		studentVo.setName(this.getName());
		studentVo.setRollNumber(this.getRollNumber());
		studentVo.setContactNumber(this.getContactNumber());
		return studentVo;
	}
	
}
