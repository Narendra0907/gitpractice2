package com.slokam.entity;

import javax.persistence.*;

@Entity
public class Mobiles {

	@Id
	@GeneratedValue
	private Integer mobileId;
	private String mobileName;
	private String mobileSim;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkpersonId")
	private Person p;

	@Override
	public String toString() {
		return "Mobiles [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileSim=" + mobileSim + ", p=" + p
				+ "]";
	}

	/**
	 * @return the mobileId
	 */
	public Integer getMobileId() {
		return mobileId;
	}

	/**
	 * @param mobileId the mobileId to set
	 */
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	/**
	 * @return the mobileName
	 */
	public String getMobileName() {
		return mobileName;
	}

	/**
	 * @param mobileName the mobileName to set
	 */
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	/**
	 * @return the mobileSim
	 */
	public String getMobileSim() {
		return mobileSim;
	}

	/**
	 * @param mobileSim the mobileSim to set
	 */
	public void setMobileSim(String mobileSim) {
		this.mobileSim = mobileSim;
	}

	/**
	 * @return the p
	 */
	public Person getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(Person p) {
		this.p = p;
	}

	public Mobiles(String mobileName, String mobileSim, Person p) {
		super();
		this.mobileName = mobileName;
		this.mobileSim = mobileSim;
		this.p = p;
	}

	public Mobiles() {
		// TODO Auto-generated constructor stub
	}
	
	
}
