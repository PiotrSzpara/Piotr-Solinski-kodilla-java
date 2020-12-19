package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
                .build();
        System.out.println(bigmac);
        //When
        String chosenBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        String chosenSauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertNotNull(chosenBun);
        assertEquals("with sesame", chosenBun);
        assertEquals(3, howManyBurgers);
        assertNotNull(chosenSauce);
        assertEquals("barbecue", chosenSauce);
        assertEquals(4, howManyIngredients);
    }
}
