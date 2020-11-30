package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{

    @Override
    public boolean executeOrder(User user, String product, LocalDateTime dateOfSale) {
        return true;
    }
}
