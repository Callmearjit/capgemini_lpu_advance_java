package com.delivery;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")   
public class DeliveryService {

    public DeliveryService() {
        System.out.println("DeliveryService Constructor Called");
    }

    @PostConstruct
    public void init() {
        System.out.println("Delivery Service Ready");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Delivery Service Closed");
    }

    public void deliverOrder() {
        System.out.println("Order Delivered ");
    }

	
}
