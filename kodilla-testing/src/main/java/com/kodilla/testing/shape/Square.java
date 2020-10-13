package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double field;


    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;

        shapeName = "Square";
        double a = 2.5;
        field = a * a;
    }

    public String getShapeName(){
        shapeName = "Square";
        return shapeName;


    }
    public double getField(){
        return field;

    }
}
