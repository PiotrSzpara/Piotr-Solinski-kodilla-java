package com.kodilla.good.patterns.challenges.foodshop;

public class OrderRequestRetriever {

    public OrderRequest sendOrder(OrderRequest orderRequest) {
        boolean isAvailable = orderRequest.getShop().process();
        if (isAvailable) {
            System.out.println("Order made for: "+ orderRequest.getProduct() + ". Quantity sold: " + orderRequest.getQuantity());
        }else {
            System.out.println("Product not available. Try another product");
        }

        return orderRequest;
    }


}
