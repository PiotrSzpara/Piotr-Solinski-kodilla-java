package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continentList;

    public World(final List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity(){

        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        }
        public Set<String> getCountryList(){

        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getCountryName)
                .collect(Collectors.toSet());

    }
}
