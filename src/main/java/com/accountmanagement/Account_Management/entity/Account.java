package com.accountmanagement.Account_Management.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account{
	@Id
	private String accNo;
	private String cid;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String accNo,String cid,Double balance){
		super();
		this.accNo= accNo;
		this.cid= cid;
		this.balance= balance;
	}
	
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
