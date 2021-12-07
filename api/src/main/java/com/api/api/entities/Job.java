package com.api.api.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {
	@Id
	private int id;
	private String dept_name;
	private String position;
	private String job_discription;
	private String technology;
	private String hiring_manager;
	private String location;
	private String experience;
	private int vacancy;
	
	public Job(int id, String dept_name, String position, String job_discription, String technology, String hiring_manager,
			String location, String experience, int vacancy) {
		super();
		this.id = id;
		this.dept_name = dept_name;
		this.position = position;
		this.job_discription = job_discription;
		this.technology = technology;
		this.hiring_manager = hiring_manager;
		this.location = location;
		this.experience = experience;
		this.vacancy = vacancy;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
//	public String getJob_discription() {
//		return job_discription;
//	}
	public void setJob_discription(String job_discription) {
		this.job_discription = job_discription;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
//	public String getHiring_manager() {
//		return hiring_manager;
//	}
	public void setHiring_manager(String hiring_manager) {
		this.hiring_manager = hiring_manager;
	}
//	public String getLocation() {
//		return location;
//	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
//	public int getVacancy() {
//		return vacancy;
//	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

}
