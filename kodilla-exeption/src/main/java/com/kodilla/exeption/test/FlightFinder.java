package com.kodilla.exeption.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warszawa", true);
        flights.put("Kraków", false);
        flights.put("Gdańsk", true);
        flights.put("Wrocław", true);
        flights.put("Poznań", true);
        flights.put("Katowice", false);

        for (Map.Entry<String, Boolean> flightsDeparture : flights.entrySet()) {
            if (flightsDeparture.getValue() == false && flightsDeparture.getKey() == flight.getArrivalAirport()) {
                System.out.println("Flight doesn't exist");
                throw new RouteNotFoundException();

            }else if(flightsDeparture.getValue() == true && flightsDeparture.getKey() == flight.getArrivalAirport()) {
                System.out.println("Flight exist");

            }

        }
    }
}
