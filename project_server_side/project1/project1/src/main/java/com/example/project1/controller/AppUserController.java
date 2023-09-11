package com.example.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.dto.ChangePasswordSuccessStatus;
import com.example.project1.dto.EmailVerificationStatus;
import com.example.project1.dto.LoginSuccessStatus;
import com.example.project1.dto.ResetPasswordSuccessStatus;
import com.example.project1.dto.SendMailOnForgottenPasswordStatus;
import com.example.project1.dto.SignupSuccessStatus;
import com.example.project1.entity.AppUser;
import com.example.project1.entity.PasswordChange;
import com.example.project1.service.AppUserService;

@RestController
@RequestMapping("admin")
@CrossOrigin
public class AppUserController {
	@Autowired
	private AppUserService appUserService;
	
	@PostMapping("signup")
    public ResponseEntity<SignupSuccessStatus> save(@RequestBody AppUser appUser) throws Exception
    {
    	return ResponseEntity.ok(appUserService.save(appUser));
    }
    
    /*
    {
      "firstName":"Rama",
      "lastName":"kumara",
      "email":"a@gmail.co.ina",
      "password":"333"
     }
    */
  
    
    @PostMapping("login")
    public ResponseEntity<LoginSuccessStatus> login(@RequestBody AppUser appUser)
    {
    	return ResponseEntity.ok(appUserService.login(appUser));
    }

	/*
	
	{  
	"email":"a@gmail.co.in",
	"password":"123"
	}
	
	*/
    
    @GetMapping("verifyMailId/{token}/{email}")
    public ResponseEntity<EmailVerificationStatus> verifyMailId(@PathVariable String token,
    		                                                    @PathVariable String email)
    {
    	return ResponseEntity.ok(appUserService.verifyMailId(token, email));
    }
    
    @PostMapping("sendMailOnForgottenPassword")
    public ResponseEntity<SendMailOnForgottenPasswordStatus> sendMailOnForgottenPassword(@RequestBody AppUser appUser) throws Exception
    {
    	return ResponseEntity.ok(appUserService.sendMailOnForgottenPassword(appUser));
    }
    
    @PostMapping("resetPassword")
    public ResponseEntity<ResetPasswordSuccessStatus> resetPassword(@RequestParam String email,
    		                                                        @RequestParam String password,
    		                                                        @RequestParam String confirmPassword)
    {
    	return ResponseEntity.ok(appUserService.resetPassword(email, password, confirmPassword));
    }
    
    @PostMapping("changePassword")
    public ResponseEntity<ChangePasswordSuccessStatus> changePassword(@RequestBody PasswordChange passwordChange)
    {
    	return ResponseEntity.ok(appUserService.changePassword(passwordChange.getEmail(),
    			                                               passwordChange.getOldPassword(),
    			                                               passwordChange.getNewPassword(),
    			                                               passwordChange.getConfirmPassword()));
    }
}   




