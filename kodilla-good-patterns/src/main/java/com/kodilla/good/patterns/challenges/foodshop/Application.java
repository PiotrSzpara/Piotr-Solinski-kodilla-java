package com.kodilla.good.patterns.challenges.foodshop;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest order = orderRequestRetriever.sendOrder(new OrderRequest(new ExtraFoodShop(), new Product("marchewka", 10.0), 5));


        System.out.println("Order request:"+ order);

    }
}
