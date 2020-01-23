package com.Mail.sender2;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;

	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendmail(MailSenderPogo model) {
		SimpleMailMessage message=new SimpleMailMessage();
	   message.setTo(model.geteMail());
	  // message.setFrom("@gmail.com");
	   message.setSubject("walk-in");
	   message.setText("waiting for u");
	   mailSender.send(message);
	   
	   
	}

}
