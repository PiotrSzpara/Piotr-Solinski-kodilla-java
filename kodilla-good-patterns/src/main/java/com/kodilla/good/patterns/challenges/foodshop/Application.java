package com.kodilla.good.patterns.challenges.foodshop;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        System.out.println("customer: " + orderRequest.getCustomer().getCustomerName()+ "\nshopping list: "
                + orderRequest.getShoppingList() + "\ntransaction date: "+ orderRequest.getDateOfSale()
                + "\ndelivery destination: " + orderRequest.getCustomer().getAddress());
    }
}
