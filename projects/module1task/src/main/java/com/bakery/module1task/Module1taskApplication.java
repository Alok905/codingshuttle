package com.bakery.module1task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1taskApplication implements CommandLineRunner {
	public final CakeBaker cakeBaker;


	public Module1taskApplication(CakeBaker cakeBaker) {
		this.cakeBaker = cakeBaker;
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1taskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.cakeBaker.bakeCake();
	}
}
