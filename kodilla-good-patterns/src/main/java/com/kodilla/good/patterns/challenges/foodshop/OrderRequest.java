package com.kodilla.good.patterns.challenges.foodshop;

public class OrderRequest {
    private final Shop shop;
    private final Product product;
    private final int quantity;

    public OrderRequest(Shop shop, Product product, int quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "shop=" + shop +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}



