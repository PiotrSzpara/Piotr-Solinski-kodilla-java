package com.kodilla.good.patterns.challenges;


public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        ProductOrderService productOrderService = new ProductOrderService();
        System.out.println(productOrderService.executeOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDateOfSale()));

        System.out.println("customer:" + orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + "- product: "  + orderRequest.getProduct() + "- transaction date: " + orderRequest.getDateOfSale());
    }
}
