package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class CalculatorTestSuite {
    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(4.3,5.4);
        double sub = calculator.sub(8.5, 5.4);
        double mul = calculator.mul(2.2, 3.5);
        double div = calculator.div(8.2,4.3);

        //Then
        Assert.assertEquals(9.7, add,0);
        Assert.assertEquals(3.1, sub,0.001);
        Assert.assertEquals(7.7, mul, 0.001);
        Assert.assertEquals(1.906, div,0.001);
    }
}
