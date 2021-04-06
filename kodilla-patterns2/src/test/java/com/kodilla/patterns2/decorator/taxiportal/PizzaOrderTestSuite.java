package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15.0), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza ", description);
    }
    @Test
    public void testPizzaWithDoubleCheese() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleChesseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testPizzaWithDoubleChesseDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleChesseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with: double chesse,", description);
    }
    @Test
    public void testPizzaWithOlivesAndMushroomsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testPizzaWithOnionAndMushroomsAndExtraSauseDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with: onion, mushrooms, extra sause", description);
    }
    @Test
    public void testPizzaWithOlivesAndDoubleCheeseAndHamAndDeliveryCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new DoubleChesseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testPizzaWithOlivesAndDoubleCheeseAndHamAndDeliveryDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new DoubleChesseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with: olives, double cheese, ham, + delivery", description);
    }
}
