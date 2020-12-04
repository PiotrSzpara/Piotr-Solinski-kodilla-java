package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightSet {
    public Set<Flight> allFlightSet() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Warsaw", "Krakow","A328"));
        flights.add(new Flight("Krakow", "Gdansk","A584"));
        flights.add(new Flight("Wroclaw", "Krakow","A291"));
        flights.add(new Flight("Warsaw", "Wroclaw","A098"));
        flights.add(new Flight("Krakow", "Poznan","A524"));
        flights.add(new Flight("Wroclaw", "Poznan","A299"));
        flights.add(new Flight("Warsaw", "Katowice","A738"));
        flights.add(new Flight("Katowice", "Warsaw","A053"));
        flights.add(new Flight("Krakow", "Wroclaw","A982"));
        flights.add(new Flight("Katowice", "Wroclaw","A398"));
        flights.add(new Flight("Krakow", "Katowice","A424"));
        flights.add(new Flight("Wroclaw", "Warsaw","A039"));

        return flights;













    }
}
