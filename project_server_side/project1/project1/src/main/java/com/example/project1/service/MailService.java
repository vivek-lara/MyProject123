package com.example.project1.service;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.project1.entity.AppUser;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService{
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String sendMailToVerifyMailId(String token, String email) throws Exception
	{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime,true);
		helper.setTo(email);
		helper.setSubject("Verify your emailId");
		StringBuffer sb = new StringBuffer();
		sb.append("<a href='http://localhost:9090/admin/verifyMailId/"+token+"/"+email+"'>verify</a>");
		helper.setText(sb.toString(), true);
		javaMailSender.send(mime);
		return "mail sent successfully";
	}
	
	public String sendMailOnForgottenPassword(String email) throws Exception
	{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime,true);
		helper.setTo(email);
		helper.setSubject("reset your password");
		StringBuffer sb = new StringBuffer();
		sb.append("<form action='http://localhost:9090/admin/resetPassword'  method='post'>");
		sb.append("<input type='hidden' name='email' value='"+email+"'>");
		sb.append("Password:<input type='password' name='password'><br>");
		sb.append("Confirm Password:<input type='password' name='confirmPassword'>");
		sb.append("<input type='submit' value='Reset Password'>");
		sb.append("</form>");
		helper.setText(sb.toString(),true);
		javaMailSender.send(mime);
		return "mail sent successfully";
		
	}
}
