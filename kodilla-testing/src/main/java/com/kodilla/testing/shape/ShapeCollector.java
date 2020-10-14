package com.kodilla.testing.shape;

import java.util.ArrayList;
public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);

    }

    public Shape getFigure(int shapeNumber){
        return shapeList.get(shapeNumber);
    }

    public String showFigures(){

        Shape shape1 = new Circle("Circle", 38.9);
        Shape shape2 = new Square("Square", 43.6);
        Shape shape3 = new Rectangle("Rectangle", 35.9,3.8);

        addFigure(shape1);
        addFigure(shape2);
        addFigure(shape3);

        return shape1.getShapeName() + shape2.getShapeName() + shape3.getShapeName();
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }




}
