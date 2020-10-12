package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    List<Integer> numbers;

    public OddNumbersExterminator(){
        numbers = new ArrayList<>();
    }

    public List<Integer> exterminate(List<Integer> numbers){
        for (int i=0; i<20; i++) {
            numbers.add(i);
        }

        List<Integer> exterminator = new ArrayList<>();
        for(int i=0; i<numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 2 == 0) {
                exterminator.add(i);
            }
        }
        return exterminator;
    }
}
