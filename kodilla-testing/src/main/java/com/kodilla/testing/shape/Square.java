package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double sideA;


    public Square(String shapeName, double sideA) {
        this.shapeName = shapeName;
        this.sideA = sideA;

        shapeName = "Square";

    }

    public String getShapeName(){
        shapeName = "Square";
        return shapeName;


    }
    public double getField(){
        return sideA * sideA;

    }
}
