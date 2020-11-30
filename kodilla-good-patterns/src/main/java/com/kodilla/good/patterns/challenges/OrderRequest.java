package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private String product;
    private LocalDateTime dateOfSale;

    public OrderRequest(User user, String product, LocalDateTime dateOfSale) {
        this.user = user;
        this.product = product;
        this.dateOfSale = dateOfSale;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }
}
