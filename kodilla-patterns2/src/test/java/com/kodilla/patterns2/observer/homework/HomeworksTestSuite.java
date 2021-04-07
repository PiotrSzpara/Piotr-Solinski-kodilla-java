package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworksTestSuite {

    @Test
    public void testUpdateHomework() {
        //Given
        Student adamAsnyk = new Student("Adam Asnyk");
        Student barbaraBliska = new Student("Barbara Bliska");
        Student czarekCezary = new Student("Czarek Cezary");

        Mentor zenonZarazek = new Mentor("Zenon Zarazek");
        Mentor wiesławWilk = new Mentor("Wiesław Wilk");

        adamAsnyk.registerObserver(zenonZarazek);
        barbaraBliska.registerObserver(wiesławWilk);
        czarekCezary.registerObserver(zenonZarazek);

        //When
        adamAsnyk.addHomework("Homework 22.3");
        barbaraBliska.addHomework("Homework 12.2");
        barbaraBliska.addHomework("Homework 13.2");
        czarekCezary.addHomework("Homework 3.5");
        czarekCezary.addHomework("Homework 4.1");

        //Then
        assertEquals(3, zenonZarazek.getUpdateCount());
        assertEquals(2, wiesławWilk.getUpdateCount());


    }
}
