package com.kodilla.good.patterns.challenges.foodshop;

public class HealthyShop implements Shop {
    @Override
    public boolean process() {
        System.out.println("Healthy Shop");
        return true;
    }
}
