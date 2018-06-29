package com.ran.sample.spring.vo;

public class StudentVO {
	private Integer id;
	private String name;
	private String contactNumber;
	private Integer rollNumber;
	private String school;
	
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", rollNumber="
				+ rollNumber + ", school=" + school + "]";
	}
	
}
