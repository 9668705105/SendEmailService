package com.example.olive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.olive.service.EmailSenderService;

@SpringBootApplication
public class Application {
	
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		emailSenderService.sendsimpleEmail("springemail26@gmail.com","Hiiii Monalisha how r u","Testing Email");	

	}
	
	

}
