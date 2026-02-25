package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onilneFood.FoodAppConfig;
import com.order.OrderService;

public class MainApp {
	public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FoodAppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        context.close();
    }

}
