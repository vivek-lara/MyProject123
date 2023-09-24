package com.example.demo3;

import java.util.Properties;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
public class MailController {

	@GetMapping("test")
	public String sendMail() throws Exception
	{
		JavaMailSender javaMailSender = getJavaMailSender();
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime,true);
		helper.setTo("2484vivek@gmail.com");
		helper.setCc("");
		helper.setSubject("this is the subject line");
		helper.setText("<h1>this is the body of the mail ............. This is the text</h1>",true);
		javaMailSender.send(mime);
		return "success";
	}
	
	public JavaMailSender getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    
	    mailSender.setUsername("2484vivek@gmail.com");
	    mailSender.setPassword("ksajpiercfsomymy");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	 //   props.put("mail.debug", "true");
	    
	    return mailSender;
	}

}
