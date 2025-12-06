package com.codingshuttle.alok.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy");
    }
}
