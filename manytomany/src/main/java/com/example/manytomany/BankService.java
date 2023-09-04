package com.example.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	 private BankRepository bankRepository;
	
	 public Bank save(Bank bank)
	 {
		 return bankRepository.save(bank);
	 }
	 public List<Bank> readAll()
	 {
		 return (List<Bank>)bankRepository.findAll();
	 }
	 public Bank read(Integer id)
	 {
		 return bankRepository.findById(id).get();
	 }
	 public Integer delete(Integer id)
	 {
		 bankRepository.deleteById(id);
		 return id;
	 }
		 
}
