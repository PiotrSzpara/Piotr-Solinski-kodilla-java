package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    private String departureCity;
    private String arrivalCity;
    private String flightNumber;

    public Flight(String departureCity, String arrivalCity, String flightNumber) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(departureCity, flight.departureCity))
            return false;
        if (!Objects.equals(arrivalCity, flight.arrivalCity)) return false;
        return Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        int result = departureCity != null ? departureCity.hashCode() : 0;
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight" +
                " from: " + departureCity +
                " to: " + arrivalCity;
    }
}
