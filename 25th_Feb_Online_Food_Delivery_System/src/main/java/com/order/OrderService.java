package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.notification.NotificationService;
import com.restaurant.RestaurantService;

@Component
public class OrderService {

    private NotificationService notificationService;

    @Autowired
    private RestaurantService restaurantService;

    // Constructor Injection 
    public OrderService(
            @Qualifier("SmsNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        restaurantService.prepareOrder();
        notificationService.sendNotification("Your food is on the way");
    }
}