package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("when create OddNumberExterminator with emptyList, " +
            "then emptyListTest should return null"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        ArrayList<Integer> emptyListTest = (ArrayList<Integer>) oddNumbersExterminator.exterminate(emptyList);

        //Then
        //Assertions.assertEquals(emptyListTest, emptyList);
    }
    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalNumbers = new ArrayList<>();

        normalNumbers.add(2);
        normalNumbers.add(3);
        normalNumbers.add(4);
        normalNumbers.add(5);
        normalNumbers.add(6);
        normalNumbers.add(7);

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(0);
        evenNumbers.add(2);
        evenNumbers.add(4);

        //When
        ArrayList<Integer> evenListTest = (ArrayList<Integer>) oddNumbersExterminator.exterminate(normalNumbers);
        //Then
        //Assertions.assertEquals(evenListTest, evenNumbers);
        //Assertions.assertEquals(evenListTest, Arrays.asList(0, 2, 4,));
    }
}