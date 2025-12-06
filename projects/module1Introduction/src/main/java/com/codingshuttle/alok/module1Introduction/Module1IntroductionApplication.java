package com.codingshuttle.alok.module1Introduction;

import com.codingshuttle.alok.module1Introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//	final NotificationService notificationServiceObj;

//	public Module1IntroductionApplication (
//			@Qualifier("email-notification") NotificationService notificationServiceObj) {
//		this.notificationServiceObj = notificationServiceObj;
//	}

//	public Module1IntroductionApplication (NotificationService notificationServiceObj) {
//		this.notificationServiceObj = notificationServiceObj;
//}
	@Autowired
	Map<String, NotificationService> notificationServiceMap;


	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(var notificationService: notificationServiceMap.entrySet()) {
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}
}
