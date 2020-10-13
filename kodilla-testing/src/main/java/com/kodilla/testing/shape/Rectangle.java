package com.kodilla.testing.shape;

public class Rectangle implements Shape{
    private String shapeName;
    private double field;



    public Rectangle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;

        shapeName = "Rectangle";
        double a = 2.5;
        double b = 2.5;
        field = a * b;
    }

    public String getShapeName(){
        return shapeName;

    }
    public double getField(){
        return field;

    }
}
