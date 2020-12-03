package com.kodilla.good.patterns.challenges.foodshop;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequestRetriever {
    public OrderRequest retrieve () {
        Customer customer1 = new Customer("Adam Smith", "Sesame Street 56, New York");
        ShoppingList shoppingList = new ShoppingList();

        Map<String, Double> list = shoppingList.getShoppingList();

        LocalDateTime dateOfProductSale = LocalDateTime.of(2020, 11,23,12,32,02);


        return new OrderRequest(customer1, (ShoppingList) list, dateOfProductSale);
    }
}
