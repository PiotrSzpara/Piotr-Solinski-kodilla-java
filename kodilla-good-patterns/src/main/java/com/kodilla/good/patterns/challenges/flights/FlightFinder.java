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
    public void findFlightThrough(Set<Flight> flights, String arrivalCity, String departureCity) {
        Set<Flight> flightList1 = flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toSet());
        Set<Flight> flightList2 = flights.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toSet());
        for (Flight flight1 : flightList1) {
            for (Flight flight2 : flightList2) {
                if (flight1.getArrivalCity().equals(flight2.getDepartureCity())) {
                    System.out.println("Flight from: " + flight1.getDepartureCity()
                        + " through: " + flight1.getArrivalCity() + " to: " + flight2.getArrivalCity());
                }
            }
        }
    }
}

