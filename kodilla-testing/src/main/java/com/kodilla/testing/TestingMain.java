package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser =  new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(20,10);

        int addResult = calculator.addNumbers();
        int subResult = calculator.subNumbers();

        if (addResult == 30){
            System.out.println("Add method is OK");
        }else {
            System.out.println("Add method ERROR!");
        }

        if (subResult == 10){
            System.out.println("Subtract method is OK");
        }else {
            System.out.println("Subtract method ERROR!");
        }
    }
}