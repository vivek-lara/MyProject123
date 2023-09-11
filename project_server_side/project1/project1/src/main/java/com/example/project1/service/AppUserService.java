package com.example.project1.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.dto.ChangePasswordSuccessStatus;
import com.example.project1.dto.EmailVerificationStatus;
import com.example.project1.dto.LoginSuccessStatus;
import com.example.project1.dto.ResetPasswordSuccessStatus;
import com.example.project1.dto.SendMailOnForgottenPasswordStatus;
import com.example.project1.dto.SignupSuccessStatus;
import com.example.project1.entity.AppUser;
import com.example.project1.repository.AppUserRepository;

@Service
public class AppUserService {
	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private MailService mailService;

	public SignupSuccessStatus save(AppUser appUser) throws Exception {
		String token = createToken();
		appUser.setToken(token);
		appUserRepository.save(appUser);
		mailService.sendMailToVerifyMailId(token, appUser.getEmail());
		SignupSuccessStatus signupSuccessStatus = new SignupSuccessStatus();
		signupSuccessStatus.setMessage(
				"signup is successful,we have sent a mail on your email id,please go to your mail box and click verify");
		signupSuccessStatus.setStatus(true);
		return signupSuccessStatus;
	}

	private String createToken() {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String token = "";
		for (int i = 1; i <= 6; i++) {
			token += str.charAt((int) (str.length() * Math.random()));
		}
		return token;
	}

	public LoginSuccessStatus login(AppUser clientObject) {
		LoginSuccessStatus loginSuccessStatus = new LoginSuccessStatus();
		loginSuccessStatus.setMessage("user is not available");
		Optional<AppUser> optional = appUserRepository.findById(clientObject.getEmail());
		if (optional.isPresent()) {
			AppUser dbObject = optional.get();
			loginSuccessStatus.setMessage("incorrect password");
			if (dbObject.getPassword().equals(clientObject.getPassword())) {
				loginSuccessStatus.setMessage(
						"Your email Id is not verified,we have sent a mail on your email id,please go to your mail box and click verify");
				if (dbObject.getStatus() == 1) {
					loginSuccessStatus.setMessage("login success");
					loginSuccessStatus.setStatus(true);
				}
			}
		}
		return loginSuccessStatus;
	}

	public EmailVerificationStatus verifyMailId(String token, String email) {
		EmailVerificationStatus emailVerificationStatus = new EmailVerificationStatus();
		emailVerificationStatus.setMeassage("invalid token");
		AppUser appUser = appUserRepository.findByTokenAndEmail(token, email);
		if (appUser != null) {
			appUser.setStatus(1);
			appUserRepository.save(appUser);
			emailVerificationStatus.setStatus(true);
			emailVerificationStatus.setMeassage("Your emailId verified successfully");
		}
		return emailVerificationStatus;

	}

	public SendMailOnForgottenPasswordStatus sendMailOnForgottenPassword(AppUser appUser) throws Exception {
		Optional<AppUser> optional = appUserRepository.findById(appUser.getEmail());
		SendMailOnForgottenPasswordStatus forgottenPasswordStatus = new SendMailOnForgottenPasswordStatus();
		forgottenPasswordStatus.setMessage("user is not available");
		if (optional.isPresent()) {
			mailService.sendMailOnForgottenPassword(appUser.getEmail());
			forgottenPasswordStatus.setMessage("Mail sent to " + appUser.getEmail() + " with a password reset form");
			forgottenPasswordStatus.setStatus(true);
		}
		return forgottenPasswordStatus;
	}

	public ResetPasswordSuccessStatus resetPassword(String email, String password, String confirmPassword) {
		ResetPasswordSuccessStatus resetPasswordSuccessStatus = new ResetPasswordSuccessStatus();
		resetPasswordSuccessStatus.setMessage("Confirm password is not matching with password");
		if (password.equals(confirmPassword)) {
			AppUser appUser = appUserRepository.findById(email).get();
			appUser.setPassword(password);
			appUserRepository.save(appUser);
			resetPasswordSuccessStatus.setMessage("password has been set successfully");
			resetPasswordSuccessStatus.setStatus(true);
		}
		return resetPasswordSuccessStatus;
	}
	
	public ChangePasswordSuccessStatus changePassword(String email,String oldPassword,String newPassword,String confirmPassword)
	{
		ChangePasswordSuccessStatus changePasswordSuccessStatus = new ChangePasswordSuccessStatus();
		changePasswordSuccessStatus.setMessage("Incorrect password");
		AppUser appUser = appUserRepository.findById(email).get();
		
		if(appUser.getPassword().equals(oldPassword))
		{
			changePasswordSuccessStatus.setMessage("Confirm password is not matching with new password");
			if(newPassword.equals(confirmPassword))
			{
				appUser.setPassword(newPassword);
				appUserRepository.save(appUser);
				changePasswordSuccessStatus.setMessage("password changed successfully");
				changePasswordSuccessStatus.setStatus(true);
			}	
		}
		return changePasswordSuccessStatus;
	}
}
