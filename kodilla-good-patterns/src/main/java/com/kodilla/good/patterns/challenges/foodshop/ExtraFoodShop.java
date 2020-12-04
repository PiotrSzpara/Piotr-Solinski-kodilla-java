package com.kodilla.good.patterns.challenges.foodshop;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process() {
        System.out.println("Extra Food Shop");
        return true;
    }
}
