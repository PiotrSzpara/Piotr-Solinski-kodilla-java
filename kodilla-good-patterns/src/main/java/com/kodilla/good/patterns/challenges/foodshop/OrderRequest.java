package com.kodilla.good.patterns.challenges.foodshop;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Customer customer;
    private final ShoppingList shoppingList;
    private final LocalDateTime dateOfSale;

    public OrderRequest(Customer customer, ShoppingList shoppingList, LocalDateTime dateOfSale) {
        this.customer = customer;
        this.shoppingList = shoppingList;
        this.dateOfSale = dateOfSale;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }
}
