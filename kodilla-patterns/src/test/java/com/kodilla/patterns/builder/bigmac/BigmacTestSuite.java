package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("salad")
                .ingredient("bacon")
                .ingredient("cheese")
                .build();System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyBurgers);
        assertEquals(4, howManyIngredients);
    }
}
