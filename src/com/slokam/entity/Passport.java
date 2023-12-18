package com.slokam.entity;

import javax.persistence.*;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private Integer passportId;
	private String passportNumber;
	private String passportExpireDate;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "passport")
	@JoinColumn(name="fkpersonId")
	private Person per ;
	
	public Passport(Integer passportId, String passportNumber, String passportExpireDate, Person per) {
		super();
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.passportExpireDate = passportExpireDate;
		this.per = per;
	}



	/**
	 * @return the passportId
	 */
	public Integer getPassportId() {
		return passportId;
	}



	/**
	 * @param passportId the passportId to set
	 */
	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}



	/**
	 * @return the per
	 */
	public Person getPer() {
		return per;
	}



	/**
	 * @param per the per to set
	 */
	public void setPer(Person per) {
		this.per = per;
	}



	public Passport() {
		// TODO Auto-generated constructor stub
	}



	public Passport(String passportNumber, String passportExpireDate) {
		super();
		this.passportNumber = passportNumber;
		this.passportExpireDate = passportExpireDate;
	}



	/**
	 * @return the passportNumber
	 */
	public String getPassportNumber() {
		return passportNumber;
	}



	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}



	/**
	 * @return the passportExpireDate
	 */
	public String getPassportExpireDate() {
		return passportExpireDate;
	}



	/**
	 * @param passportExpireDate the passportExpireDate to set
	 */
	public void setPassportExpireDate(String passportExpireDate) {
		this.passportExpireDate = passportExpireDate;
	}



	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", passportExpireDate="
				+ passportExpireDate + ", per=" + per + "]";
	}



	public Passport(String passportNumber, String passportExpireDate, Person per) {
		super();
		this.passportNumber = passportNumber;
		this.passportExpireDate = passportExpireDate;
		this.per = per;
	}



	
	
	
}
