package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = "To be, or not to be, that is the question:";

        String poem1 = poemBeautifier.beautify(poem, s -> s.toUpperCase());
        System.out.println(poem1);

        String poem2 = poemBeautifier.beautify(poem, s -> s.toLowerCase());
        System.out.println(poem2);

        String poem3 = poemBeautifier.beautify(poem, s -> s.replace('o','O'));
        System.out.println(poem3);

        String poem4 = poemBeautifier.beautify(poem, s -> s.replaceAll("be", "bee"));
        System.out.println(poem4);

        String poem5 = poemBeautifier.beautify(poem, s -> s.concat(" that is the question?"));
        System.out.println(poem5);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



        /*System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is third example text."));*/

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);*/


    }
}
