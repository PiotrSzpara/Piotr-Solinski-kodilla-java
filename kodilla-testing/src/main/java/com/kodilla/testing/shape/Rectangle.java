package com.kodilla.testing.shape;

public class Rectangle implements Shape{
    private String shapeName;
    private double sideA;
    private double sideB;



    public Rectangle(String shapeName, double sideA, double sideB) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;


        shapeName = "Rectangle";

    }

    public String getShapeName(){
        return shapeName;

    }
    public double getField(){
        return sideA * sideB;

    }
}
