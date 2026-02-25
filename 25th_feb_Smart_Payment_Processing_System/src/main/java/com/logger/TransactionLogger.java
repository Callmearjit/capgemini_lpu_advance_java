package com.logger;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TransactionLogger {

    public TransactionLogger() {
        System.out.println("TransactionLogger Constructor Called");
    }

    @PostConstruct
    public void init() {
        System.out.println("Logger initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Logger destroyed");
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
