package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlightTo(Set<Flight> flights, String arrivalCity) {
        flights.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .forEach(System.out :: println);

    }
    public void findFlightFrom(Set<Flight> flights, String departureCity) {
        flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .forEach(System.out::println);

    }
    public void findFlightThrough(Set<Flight> flights, String departureCity, String arrivalCity) {
        Set<Flight> flightFromList = flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toSet());
        Set<Flight> flightToList = flights.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toSet());
        for (Flight flightFrom : flightFromList) {
            for (Flight flightTo : flightToList) {
                if (flightFrom.getArrivalCity().equals(flightTo.getDepartureCity())) {
                    System.out.println("Flight from: " + flightFrom.getDepartureCity()
                        + " through: " + flightFrom.getArrivalCity() + " to: " + flightTo.getArrivalCity());
                }
            }
        }
    }
}

