package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int [] numbers = {122,123,432,245,214,135,546,784,135,654,646,42,244,577};

        int sum = 0;

        for(int i=0; i<numbers.length; i++){

            sum += numbers[i];
        }
        int amount = numbers.length;

        //When
        double average = (double)sum/amount;
        double functionAv = ArrayOperations.getAverage(numbers);


        //Then
        Assertions.assertEquals(average, functionAv);

    }
}
