package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	@RequestMapping("1")
	public String test() {
		System.out.println("a");
		return "abc";
	}

}
