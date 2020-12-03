package com.kodilla.good.patterns.challenges.foodshop;

import java.util.ArrayList;
import java.util.List;

public class ProducerList {
    List<Producer> getProducerList() {
        List<Producer> producerList = new ArrayList<>();
        producerList.add(new Producer("ExtraFoodShop"));
        producerList.add(new Producer("HealthyShop"));
        producerList.add(new Producer("GlutenFreeShop"));

        return producerList;
    }
}
