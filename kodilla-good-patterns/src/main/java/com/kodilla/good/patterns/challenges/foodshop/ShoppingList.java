package com.kodilla.good.patterns.challenges.foodshop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private ProductList productList;


    public Map<String, Double> getShoppingList() {
        Map<String, Double> shoppingList = new HashMap<>();
        double appleWeight = 1.2;
        shoppingList.put(productList.getApple().getProductName(),
                productList.getApple().getUnitPrice()* appleWeight);
        double eggAmount = 12;
        shoppingList.put(productList.getEgg().getProductName(), productList.getEgg().getUnitPrice()* eggAmount);
        double onionWeight = 3.9;
        shoppingList.put(productList.getOnion().getProductName(), productList.getOnion().getUnitPrice()* onionWeight);

        return shoppingList;
    }

}
