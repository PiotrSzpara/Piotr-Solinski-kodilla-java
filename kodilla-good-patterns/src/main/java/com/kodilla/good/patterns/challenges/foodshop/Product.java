package com.kodilla.good.patterns.challenges.foodshop;

import java.util.Objects;

public class Product {
    private String productName;
    private Producer producer;
    private double prize;

    public Product(String productName, Producer producer, double prize) {
        this.productName = productName;
        this.producer = producer;
        this.prize = prize;
    }


    public String getProductName() {
        return productName;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getPrize() {
        return prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0;
    }
}

