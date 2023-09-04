package com.example.manytomany;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class AccountHolder {
	@Id
	private Integer id;
	private String accountHolderName;
	private Integer accountNumber;
	@ManyToMany(mappedBy = "accountHolder")
	@JsonIgnore
	private List<Bank> bank = new ArrayList<Bank>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<Bank> getBank() {
		return bank;
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	
}
/*
 {
  "id":1,
  "accountHolderName":"hardik",
  "accountNumber":123
  }
 {
  "id":2,
  "accountHolderName":"mudit",
  "accountNumber":345
 }
 {
  "id":3,
  "accountHolderName":"bhajan",
  "accountNumber":789
 }
 */
