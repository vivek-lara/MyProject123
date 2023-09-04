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
@RequestMapping("bank")
public class BankController {
	@Autowired
	private BankService bankService;
	@PostMapping
	public Bank save(@RequestBody Bank bank)
	{
		return bankService.save(bank);
	}
	@GetMapping
    public List<Bank> readAll()
    {
    	return (List<Bank>)bankService.readAll();
    }
    @GetMapping("/{id}")
    public Bank read(@PathVariable Integer id)
    {
    	return bankService.read(id);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id)
    {
    	return bankService.delete(id);
    }
}
