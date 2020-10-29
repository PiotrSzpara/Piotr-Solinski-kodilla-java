package com.kodilla.exeption.test;

public class FlightFinderRunner {
    public static void main(String[] args) throws Exception {
        FlightFinder flightFinder = new FlightFinder();

        try {
            System.out.println("\nNew Searching ... ");
            flightFinder.findFlight(new Flight("Warszawa", "Gdańsk"));
        } catch (RouteNotFoundException e){
            System.out.println("Error # : " + e);
        } finally {
            System.out.println("Find new flight");
        }

        try {
            System.out.println("\nNew Searching ... ");
            flightFinder.findFlight(new Flight("Kraków", "Wrocław"));

        } catch (RouteNotFoundException e){
            System.out.println("Error # : " + e);
        } finally {
            System.out.println("Find new flight");
        }
        try {
            System.out.println("\nNew Searching ... ");
            flightFinder.findFlight(new Flight("Warszawa", "New York"));

        } catch (RouteNotFoundException e){
            System.out.println("Error # : " + e);
        } finally {
            System.out.println("Find new flight");
        }


    }

}
