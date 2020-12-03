package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightSet flightSet = new FlightSet();
        Set<Flight> newSet = flightSet.allFlightSet();

        FlightFinder flightTo = new FlightFinder();
        flightTo.findFlightTo(newSet, "Krakow");

        FlightFinder flightFrom = new FlightFinder();
        flightFrom.findFlightFrom(newSet, "Warsaw");

        FlightFinder flightFromToWithTrough = new FlightFinder();
        flightFromToWithTrough.findFlightThrough(newSet, "Krakow", "Wroclaw");

    }
}
