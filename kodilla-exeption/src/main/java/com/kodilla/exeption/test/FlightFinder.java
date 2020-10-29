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

        Boolean departureKey = flights.get(flight.getDepartureAirport());
        Boolean arrivalKey = flights.get(flight.getArrivalAirport());

        if (departureKey == null || arrivalKey == null || !departureKey || !arrivalKey) {
            System.out.println("Flight doesn't exist");
            throw new RouteNotFoundException();
        }else {
            System.out.println("Flight exist");
        }



       /* for (Map.Entry<String, Boolean> flightsDeparture : flights.entrySet()) {
            if (!flightsDeparture.getValue() && flightsDeparture.getKey().equals(flight.getArrivalAirport())) {
                System.out.println("Flight doesn't exist");
                throw new RouteNotFoundException();

            }else if(flightsDeparture.getValue() && flightsDeparture.getKey().equals(flight.getArrivalAirport())) {
                System.out.println("Flight exist");

            }//else {
                //System.out.println("Unknown destination!");
            }
        }*/
    }
}
