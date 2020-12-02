package com.kodilla.good.patterns.challenges.foodshop;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private double productWeight;
    private double productAmount;
    private LocalDateTime dateOfSale;

    public OrderRequest(Customer customer, Product product, double productWeight, double productAmount, LocalDateTime dateOfSale) {
        this.customer = customer;
        this.product = product;
        this.productWeight = productWeight;
        this.productAmount = productAmount;
        this.dateOfSale = dateOfSale;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }
}
