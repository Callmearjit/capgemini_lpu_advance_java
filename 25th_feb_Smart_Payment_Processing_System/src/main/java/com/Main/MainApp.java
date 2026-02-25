package com.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.processor.PaymentProcessor;
import com.sconfig.AppConfig;

public class MainApp {
	 public static void main(String[] args) {

	        AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        PaymentProcessor processor = context.getBean(PaymentProcessor.class);

	        processor.makePayment(5000);
	        processor.makePayment(2000);

	        context.close();
	    }	
}
