package com.walmart.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHENTICATE")
public class Authenticate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USERNAME")
	private String USERNAME;
	
	@Column(name="PASSWORD")
	private String PASSWORD;
	
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	
	

}
