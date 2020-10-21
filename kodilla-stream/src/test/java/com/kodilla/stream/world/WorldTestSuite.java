package com.kodilla.stream.world;

import com.kodilla.stream.portfolio.Board;
import com.kodilla.stream.portfolio.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("35029912"));
        Country france = new Country("France", new BigDecimal("54002235"));
        Country czechia = new Country("Czechia", new BigDecimal("12346754"));
        Country japan = new Country("Japan", new BigDecimal("65032354"));
        Country china = new Country("China", new BigDecimal("1503234640"));
        Country malaysia = new Country("Malaysia", new BigDecimal("250234523"));
        Country canada = new Country("Canada", new BigDecimal("150034643"));
        Country mexico = new Country("Mexico", new BigDecimal("90345329"));
        Country usa = new Country("USA", new BigDecimal("238112934"));
        Country chile = new Country("Chile", new BigDecimal("35092345"));
        Country peru = new Country("Peru", new BigDecimal("13004564"));
        Country argentina = new Country("Argentina", new BigDecimal("140324642"));
        Country morocco = new Country("Morocco", new BigDecimal("23048738"));
        Country southAfrica = new Country("South Africa", new BigDecimal("130293453"));
        Country egypt = new Country("Egypt", new BigDecimal("28345928"));

        List<Country> europe = new ArrayList<>();
        europe.add(poland);
        europe.add(france);
        europe.add(czechia);

        List<Country> asia = new ArrayList<>();
        asia.add(japan);
        asia.add(china);
        asia.add(malaysia);

        List<Country> northAmerica = new ArrayList<>();
        northAmerica.add(canada);
        northAmerica.add(mexico);
        northAmerica.add(usa);

        List<Country> southAmerica = new ArrayList<>();
        southAmerica.add(chile);
        southAmerica.add(peru);
        southAmerica.add(argentina);

        List<Country> africa = new ArrayList<>();
        africa.add(morocco);
        africa.add(southAfrica);
        africa.add(egypt);

        Continent europeContinent = new Continent(europe);
        Continent asiaContinent = new Continent(asia);
        Continent northAmericaContinent = new Continent(northAmerica);
        Continent southAmericaContinent = new Continent(southAmerica);
        Continent africaContinent = new Continent(africa);

        List<Continent> allWorld = new ArrayList<>();
        allWorld.add(europeContinent);
        allWorld.add(asiaContinent);
        allWorld.add(northAmericaContinent);
        allWorld.add(southAmericaContinent);
        allWorld.add(africaContinent);

        World world = new World(allWorld);
        //When

        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("2768482994"), allPeople);
    }
}
