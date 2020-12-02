package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user1 = new User("Paul", "Novack", "Berlin");


        LocalDateTime dateOfProductSale = LocalDateTime.of(2020, 11,23,12,32, 2);

        return new OrderRequest(user1, "T-shirt - 09087", dateOfProductSale);
    }
}
