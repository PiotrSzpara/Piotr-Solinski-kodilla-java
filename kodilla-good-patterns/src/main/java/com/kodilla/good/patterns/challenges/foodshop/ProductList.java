package com.kodilla.good.patterns.challenges.foodshop;

public class ProductList {

    Product onion = new Product("onion",1, 2.12);
    Product apple = new Product("apple",1, 4.13);
    Product egg = new Product("egg",1, 0.80);

    public Product getApple() {
        return apple;
    }

    public Product getOnion() {
        return onion;
    }

    public Product getEgg() {
        return egg;
    }
}
