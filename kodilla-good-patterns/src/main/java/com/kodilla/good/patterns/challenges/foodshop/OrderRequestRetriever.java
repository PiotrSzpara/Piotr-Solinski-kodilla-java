package com.kodilla.good.patterns.challenges.foodshop;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve () {
        Customer customer1 = new Customer("Adam Smith", "Sesame Street 56, New York");
        Product product1 = new Product("Onion", new Producer("HealthyShop"), 5.49);


        LocalDateTime dateOfProductSale = LocalDateTime.of(2020, 11,23,12,32,02);


        return new OrderRequest(customer1, product1, 0.5, 4, dateOfProductSale);
    }
}
