package com.example.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository accountHolderRepository;
    
	public AccountHolder save(AccountHolder accountHolder)
	{
		return accountHolderRepository.save(accountHolder);
	}
	public List<AccountHolder> readAll()
	{
		return (List<AccountHolder>)accountHolderRepository.findAll();
	}
	public AccountHolder read(Integer id)
	{
		return accountHolderRepository.findById(id).get();
	}
	public Integer delete(Integer id)
	{
	    accountHolderRepository.deleteById(id);
		return id;
	}
}
