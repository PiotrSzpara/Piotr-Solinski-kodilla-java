package com.kodilla.good.patterns.challenges.foodshop;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process() {
        System.out.println("Gluten Free Shop");
        return false;
    }
}
