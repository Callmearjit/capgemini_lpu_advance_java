package com.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.logger.TransactionLogger;
import com.service.PaymentService;

@Component
public class PaymentProcessor {

    private PaymentService paymentService;

    @Autowired
    // Field Injection
    private TransactionLogger transactionLogger; 

    // Constructor Injection
    public PaymentProcessor(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(double amount) {
        transactionLogger.log("Transaction Started");
        paymentService.processPayment(amount);
        transactionLogger.log("Transaction Completed");
    }

	
}
