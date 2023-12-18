package com.slokam.entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue	
	private Integer personId;
	private String personName;
	private Double personSal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkpassportid")
	private Passport passport;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "p")	
	private List<Mobiles> mobiles;
	
	@ManyToMany(cascade = CascadeType.ALL)
	/*
	 * @JoinTable(name="PerCou", joinColumns=@JoinColumn(name="fkpid"),
	 * inverseJoinColumns=@JoinColumn(name="fkcid"))
	 */			
	private Set<Courses> courses;
	
	public Person(String personName, Double personSal) {
		super();
		this.personName = personName;
		this.personSal = personSal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courses);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(courses, other.courses);
	}

	

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSal=" + personSal
				+ ", passport=" + passport + ", mobiles=" + mobiles + ", courses=" + courses + "]";
	}

	/**
	 * @return the personId
	 */
	public Integer getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the personSal
	 */
	public Double getPersonSal() {
		return personSal;
	}

	/**
	 * @param personSal the personSal to set
	 */
	public void setPersonSal(Double personSal) {
		this.personSal = personSal;
	}

	/**
	 * @return the passport
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * @param passport the passport to set
	 */
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	/**
	 * @return the mobiles
	 */
	public List<Mobiles> getMobiles() {
		return mobiles;
	}

	/**
	 * @param mobiles the mobiles to set
	 */
	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}

	/**
	 * @return the courses
	 */
	public Set<Courses> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}

	public Person(String personName, Double personSal, Passport passport, List<Mobiles> mobiles, Set<Courses> courses) {
		super();
		this.personName = personName;
		this.personSal = personSal;
		this.passport = passport;
		this.mobiles = mobiles;
		this.courses = courses;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person( String personName, Double personSal, Passport passport) {
		super();
		this.personName = personName;
		this.personSal = personSal;
		this.passport = passport;
	}

	public Person( String personName, Double personSal, List<Mobiles> mobiles) {
		super();
		this.personName = personName;
		this.personSal = personSal;
		this.mobiles = mobiles;
	}

	public Person( String personName, Double personSal, Set<Courses> courses) {
		super();
		this.personName = personName;
		this.personSal = personSal;
		this.courses = courses;
	}
	
	
}
