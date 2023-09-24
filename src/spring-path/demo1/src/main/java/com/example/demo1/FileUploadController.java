package com.example.demo1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class FileUploadController {
	@PostMapping("f1")
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file)throws IOException
	{
		FileOutputStream out = new FileOutputStream(file.getOriginalFilename());
		out.write(file.getBytes());
		return ResponseEntity.ok("successfully uploaded");
	}
	
	@PostMapping("f2")
	public ResponseEntity<String> upload2(@RequestParam MultipartFile file,@RequestParam MultipartFile test)throws IOException
	{
	FileOutputStream out1 = new FileOutputStream(file.getOriginalFilename());
	out1.write(file.getBytes());
	FileOutputStream out2 = new FileOutputStream(test.getOriginalFilename());
	out2.write(test.getBytes());
	return ResponseEntity.ok("successfully uploaded all files");
	}
	
	@PostMapping("f3")
	public ResponseEntity<String> upload3(@RequestParam MultipartFile file,
			                              @RequestParam MultipartFile test,
			                              @RequestParam String FirstName)throws IOException
	{
		FileOutputStream out1 = new FileOutputStream(file.getOriginalFilename());
		out1.write(file.getBytes());
		
		FileOutputStream out2 = new FileOutputStream(test.getOriginalFilename());
		out2.write(test.getBytes());
		
		System.out.println(FirstName);
		return ResponseEntity.ok("files uploaded successfully");
	}
	
	@PostMapping("f4")
	public ResponseEntity<String> upload4 (@RequestParam MultipartFile file,
			                                @RequestParam MultipartFile test,
			                                @RequestParam String LastName)throws IOException
	
	{
		String baseDir = "src/main/resources/static/";
		FileOutputStream out1 = new FileOutputStream(baseDir + file.getOriginalFilename());
		out1.write(file.getBytes());
		
		FileOutputStream out2 = new FileOutputStream (baseDir + test.getOriginalFilename());
		out2.write(test.getBytes());
		System.out.println(LastName);
		
		return ResponseEntity.ok("files loaded successfully");
		
	}
}
//uploading a file from the local system to the server