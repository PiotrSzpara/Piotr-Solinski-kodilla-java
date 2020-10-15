package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemp(){
        double a = 0;
        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        for(Map.Entry<String, Double> temperature : temperatures.entrySet()) {
            a += temperature.getValue();
        }
            return a/temperatures.size();

    }
    public double calculateMedianTemp(){
        double m = 0;
        ArrayList<Double> newTemp = new ArrayList<>();
        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        for (Map.Entry<String, Double> temperature : temperatures.entrySet()) {

            newTemp.add(temperature.getValue());

        }
        int size = newTemp.size();
        for (int i = 0; i < size/2; i++) {
            newTemp.remove(Collections.max(newTemp));
            newTemp.remove(Collections.min(newTemp));

        }
        if (newTemp.size() == 2) {
            m += ((newTemp.get(0) + newTemp.get(1)) / 2);
        }
        if (newTemp.size() == 1) {
            m += newTemp.get(0);
        }
        return m;
    }
}
