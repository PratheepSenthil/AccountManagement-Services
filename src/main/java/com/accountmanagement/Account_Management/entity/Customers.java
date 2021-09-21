package com.accountmanagement.Account_Management.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customers {
	
	@Id
	private long custID;
	private String panNum;
	private long aadharNum;
	private String custName;
	private String custAddress;
	private String custEmail;
	private String custDOB;
	
	public Customers(long custID, String panNum, long aadharNum, String custName, String custAddress, String custEmail,
			String custDOB) {
		super();
		this.custID = custID;
		this.panNum = panNum;
		this.aadharNum = aadharNum;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custEmail = custEmail;
		this.custDOB = custDOB;
	}
	public long getCustID() {
		return custID;
	}
	public void setCustID(long custID) {
		this.custID = custID;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}
	

}
