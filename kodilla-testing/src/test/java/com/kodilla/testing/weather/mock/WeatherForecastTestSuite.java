package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTemperatureWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Kielce", 28.5);
        temperaturesMap.put("Wałbrzych", 22.5);
        temperaturesMap.put("Wieliczka", 29.5);
        temperaturesMap.put("Gorzów", 21.5);
        temperaturesMap.put("Gorz", 0.0);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast1 = new WeatherForecast(temperaturesMock);

        //When
        double a = 0;
        for(Map.Entry<String, Double> temp : temperaturesMap.entrySet()){
            a += temp.getValue();

        }
        double avTemp = a/weatherForecast1.calculateForecast().size();

                //Then
        Assertions.assertEquals(20.4 , avTemp);
    }
    @Test
    void testCalculateMedianTemperatureWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.5);
        temperaturesMap.put("Wroclaw", 24.5);
        temperaturesMap.put("Warszawa", 27.5);
        temperaturesMap.put("Gdansk", 23.5);
        temperaturesMap.put("Kielce", 28.5);
        temperaturesMap.put("Wałbrzych", 22.5);
        temperaturesMap.put("Wieliczka", 29.5);
        temperaturesMap.put("Gorzów", 21.5);
        temperaturesMap.put("Gorz", 0.0);


        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast2 = new WeatherForecast(temperaturesMock);

        //When
        double m = 0;
        ArrayList<Double> newTemp = new ArrayList<>();
        for (Map.Entry<String, Double> temp : temperaturesMap.entrySet()) {

            newTemp.add(temp.getValue());
        }

        for (int i = 0; i < newTemp.size() + 1; i++) {
            newTemp.remove(Collections.max(newTemp));
            newTemp.remove(Collections.min(newTemp));

        }
        if (newTemp.size() == 2) {
            m += ((newTemp.get(0) + newTemp.get(1)) / 2);
        }
        if (newTemp.size() == 1) {
            m += newTemp.get(0);
        }
        double medTemp = m;
        weatherForecast2.calculateForecast().size();

        //Then
        Assertions.assertEquals(25.0 ,medTemp);
    }
}
