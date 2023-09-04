package com.example.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Bank {
     @Id
	 private Integer id;
     private String bankName;
     private String branchName;
    @ManyToMany
     private List<AccountHolder> accountHolder = new ArrayList<AccountHolder>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public List<AccountHolder> getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(List<AccountHolder> accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	
}
/*
{
"id":101,
"bankName":"bob",
"branchName":"mahuwari",
"accountHolder":[{"id":1},{"id":2}]
}

{
"id":102,
"bankName":"canara",
"branchName":"aniwa",
"accountHolder":[{"id":1},{"id":3}]
}
{
"id":103,
"bankName":"hdfc1",
"branchName":"ayodhya1",
"accountHolder":[{"id":1},{"id":2}]
}
 */
