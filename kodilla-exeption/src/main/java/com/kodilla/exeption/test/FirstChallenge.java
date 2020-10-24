package com.kodilla.exeption.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
       if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /*
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException o) {
            System.out.println("Operation is not allowed");
        } finally {
            System.out.println( "Remember!! Do not divide by ZERO!");
        }
    }
}
