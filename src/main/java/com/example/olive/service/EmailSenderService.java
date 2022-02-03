package com.example.olive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service	
public class EmailSenderService {
	@Autowired
	private JavaMailSender javaMailSender;
	public void sendsimpleEmail(String toEmail,String body,String subject) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("springemail26@gmail.com");
		msg.setTo(toEmail);
		msg.setText(body);
		msg.setSubject(subject);
		
		javaMailSender.send(msg);
		System.out.println("Mail Sent Syccessfully.....Congrats");
	}

}
