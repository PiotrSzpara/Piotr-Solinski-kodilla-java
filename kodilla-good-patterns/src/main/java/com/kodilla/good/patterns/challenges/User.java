package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String userLocation;

    public User(String name, String surname, String userLocation) {
        this.name = name;
        this.surname = surname;
        this.userLocation = userLocation;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserLocation() {
        return userLocation;
    }
}
