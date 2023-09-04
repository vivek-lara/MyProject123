package com.example.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accountHolder")
public class AccountHolderController {
	@Autowired
	private AccountHolderService accountHolderService;
    @PostMapping
	public AccountHolder save(@RequestBody AccountHolder accountHolder)
	{
		return accountHolderService.save(accountHolder);
	}
    @GetMapping
    public List<AccountHolder> readAll()
    {
    	return (List<AccountHolder>)accountHolderService.readAll();
    }
    @GetMapping("/{id}")
    public AccountHolder read(@PathVariable Integer id)
    {
    	return accountHolderService.read(id);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id)
    {
    	return accountHolderService.delete(id);
    }
}
