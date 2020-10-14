package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite ")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding")
    class TestShapesAdd {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When

            shapeCollector.addFigure(new Circle("circle",1.6));

            int listSizeAfterAdd = shapeCollector.shapeList.size();

            //Then
            Assertions.assertEquals(1, listSizeAfterAdd );
        }
    }
    @Nested
    @DisplayName("Tests for removing")
    class TestShapesRemove {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle("circle",1.6);
            Shape shape2 = new Square("square",2.9);
            Shape shape3 = new Rectangle("rectangle",6.6, 3.4);

            //When
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            shapeCollector.removeFigure(shape2);

            int listSizeAfterRemove = shapeCollector.shapeList.size();

            //Then
            Assertions.assertEquals(2,listSizeAfterRemove);
        }
    }
    @Nested
    @DisplayName("Tests for getting")
    class TestShapesGet {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle("circle",1.6);
            Shape shape2 = new Square("square",2.9);
            Shape shape3 = new Rectangle("rectangle",6.6, 5.6);

            //When
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            Shape testShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape1,testShape);
        }
    }
    @Nested
    @DisplayName("Tests for showing")
    class TestShapesShow {
        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle("Circle",1.6);
            Shape shape2 = new Square("Square",2.9);
            Shape shape3 = new Rectangle("Rectangle",6.6, 5.7);

            //When
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            String expected = shape1.getShapeName() + shape2.getShapeName() + shape3.getShapeName();
            String showed = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(showed,expected);
        }
    }
}
