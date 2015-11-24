package com.angulaeApp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
*
*/
@Entity
@Table
public class UserRegistration implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userregistration_id_gen")
	@SequenceGenerator(name = "userregistration_id_gen", sequenceName = "userregistration_id_seq")
	@Column(name = "cid")
	private int id;

	private String firstName;

	private String lastName;

	private String userName;

	private String password;

	private Integer gender;

	private String mobile;

	private String emailId;

	private Boolean indian;

	private Boolean isEnabled;

	private Boolean passport;

	private Boolean termsOfConditions;
/*
	public UserRegistration() {

	}*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Boolean getPassport() {
		return passport;
	}

	public void setPassport(Boolean passport) {
		this.passport = passport;
	}

	public Boolean getIndian() {
		return indian;
	}

	public void setIndian(Boolean indian) {
		this.indian = indian;
	}

	public Boolean getTermsOfConditions() {
		return termsOfConditions;
	}

	public void setTermsOfConditions(Boolean termsOfConditions) {
		this.termsOfConditions = termsOfConditions;
	}

}
