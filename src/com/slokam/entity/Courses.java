package com.slokam.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	@GeneratedValue
	private Integer CourseId;
	private String courseName;
	private Integer courseDuration;
	
	@ManyToMany(cascade = CascadeType.ALL)
	/*
	 * @JoinTable(name="couper", joinColumns = @JoinColumn(name="fkcid"),
	 * inverseJoinColumns=@JoinColumn(name="fkpid"))
	 */
	private List<Person> po;

	public Courses(String courseName, Integer courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Courses [CourseId=" + CourseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", po=" + po + "]";
	}

	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return CourseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the courseDuration
	 */
	public Integer getCourseDuration() {
		return courseDuration;
	}

	/**
	 * @param courseDuration the courseDuration to set
	 */
	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	/**
	 * @return the po
	 */
	public List<Person> getPo() {
		return po;
	}

	/**
	 * @param po the po to set
	 */
	public void setPo(List<Person> po) {
		this.po = po;
	}

	public Courses(String courseName, Integer courseDuration, List<Person> po) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.po = po;
	}

	public Courses() {
		// TODO Auto-generated constructor stub
	}
	
	
}
