package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();



        System.out.println("customer:" + orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + "- product: "  + orderRequest.getProduct() + "- transaction date: " + orderRequest.getDateOfSale());
    }
}
