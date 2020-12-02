package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{


    public boolean executeOrder(User user, String product, LocalDateTime dateOfSale) {
        System.out.println(user.getName() + " " + user.getName() + " bought: " + product + ". "
                + "Sale date : " + dateOfSale + ". " + "\nDestination address: " + user.getUserLocation());

        return true;

    }
}
