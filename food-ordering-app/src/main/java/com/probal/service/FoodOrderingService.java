package com.probal.service;

import com.probal.client.RestaurantServiceClient;
import com.probal.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderingService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
