package com.kodilla.exeption.test;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String s = secondChallenge.probablyIWillThrowException(2, 1);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Problem " + e);

        } finally {
            System.out.println("Exception done !!!");

        }

    }


}
