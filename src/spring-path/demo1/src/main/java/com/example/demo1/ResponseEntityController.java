package com.example.demo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
	@GetMapping("re1")
    public ResponseEntity<String>test1()
    {
      System.out.println("from test1");
      return ResponseEntity.ok("i am from the test1");
    }
	
	    @GetMapping("re2")
		public ResponseEntity<Integer>test2()
		{
			System.out.println("from test2");
			return ResponseEntity.ok(5000);
		}
	    @GetMapping("re3")
	    public ResponseEntity<String[]>test3()
	    {
	    	System.out.println("from test3");
	    	return ResponseEntity.ok().body(new String[] {"abc","fgh"});
	 //ok is for response is successful,body containing a response
	    	
	    	//return ResponseEntity.ok(new String[]{"abc","fgh"});
	    	//both methods are possible
	    }
	    @GetMapping("re4")
		public ResponseEntity<Integer[]>test4()
		{
			System.out.println("from test4");
			return ResponseEntity.ok().body(new Integer[]{2,4,5});
		}
		@GetMapping("re5/{age}")
		public ResponseEntity<String>test5(@PathVariable Integer age)
		{
			System.out.println("from test5");
			if(age <= 0)
			{
			  return ResponseEntity.badRequest().body("age should be greater than 0");
			}
			return ResponseEntity.ok().body("proper age");
			//return ResponseEntity.ok("proper age");
		}
		@GetMapping("re6/{YearOfBirth}")
		public ResponseEntity<String>test6(@PathVariable Integer YearOfBirth)
		{
			System.out.println("from test6");
			if(YearOfBirth >= 2024 || YearOfBirth < 1)
			{
				return ResponseEntity.badRequest().body("YearOfBirth should be less than 2024 or greater than 0");
			}
			return ResponseEntity.ok().body("proper YearOfBirth");
		}
		@GetMapping("re7/{file}")
		public ResponseEntity<String>test7(@PathVariable String file)
		{
			System.out.println("from test7");
			try
			{
			  FileReader fin = new FileReader(file);	
			}
			catch (IOException e) 
			{
				e.printStackTrace();
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok().body("proper file");
		}
		
		@GetMapping("re8")
		public ResponseEntity<String> test8()
		{
			return ResponseEntity
					.ok()
					.header("content-type", "text/html")
					//.header("content-type", "text/plain")
					.body("<h1> this is the result</h1>");
		}
		
		int count;
		@GetMapping("re10")
		public ResponseEntity<String> test10()
		{
			count++;
			return ResponseEntity
					.ok()
					.header("refresh","2")
					.body("<h1> this is the result count:"+count+"</h1>");
		}
		
		@GetMapping("re11")
		public ResponseEntity<String> test11()
		{
			return ResponseEntity
					.ok()
					.header("content-disposition", "attachment;filename=a.txt")
					.body("this is the result");
		}
		
		@GetMapping("re12")
		public ResponseEntity<String> test12()
		{
			HttpHeaders headers =new HttpHeaders();
			headers.add("content-type","text/html");
			headers.add("refresh", "4");
			count++;
			return ResponseEntity
					.ok()
					.headers(headers)
					.body("<h1>this is the result:"+count+"</h1>");
		}
		
	    @GetMapping("re13")
	    public ResponseEntity<String> test13()
	    {
	    	ResponseEntity re = new ResponseEntity("success",HttpStatus.OK);
	    	return re;
	    }
	    
	    @GetMapping("re14")
	    public ResponseEntity<ArrayList<Integer>> test14()
	    {
	    	ArrayList<Integer> list = new ArrayList();
	    	list.add(120);
	    	list.add(120);
	    	list.add(120);
	    	list.add(120);
	    	ResponseEntity re = new ResponseEntity("list",HttpStatus.OK);
	    	return re;
	    }
	    
	    @GetMapping("re15")
	    public ResponseEntity<String> test15()
	    {
	    	HttpHeaders headers = new HttpHeaders();
	    	headers.add("refresh", "5");
	    	count++;
	    	ResponseEntity re = new ResponseEntity("count:"+count,headers,HttpStatus.OK);
	    	return re;
	    }
	    @GetMapping("re16")
	    public ResponseEntity<String> test16()
	    {
	    	HttpHeaders headers = new HttpHeaders();
	    	headers.add("refresh", "4");
	    	headers.add("content-type", "text/plain");
	    	count++;
	    	ResponseEntity re = new ResponseEntity("<h1>count:"+count+"</h1>",
	    			                               headers,
	    			                               HttpStatus.OK);
	    	return re;
	    }
	    
}
//responseEntity is responsible for - reponse body with status code
//or response body,headers and status code-->if headers required
//through static method or through constructor
//through responseEntity we can change the status code based on the input

