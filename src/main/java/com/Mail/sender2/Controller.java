package com.Mail.sender2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private EmailService service;
	
	@RequestMapping("/Email-signIn")
	public String signIn() {
		return "please sign-in";
		
	}
	@RequestMapping("/signUp-success")
	public String signUpSuccess() {
		MailSenderPogo pojo=new MailSenderPogo();
		pojo.setFirstName("sagar");
		pojo.setLastName("sb");
		pojo.seteMail("mithunsbogali@gmail.com");
		
		try {
			
			service.sendmail(pojo);
		}
		catch(MailException e)
		{
			
		}
		return "signUp success";
	}
	

}
