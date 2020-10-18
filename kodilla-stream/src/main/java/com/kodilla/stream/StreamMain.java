package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()) >= 20)
                .filter(forumUser -> forumUser.getUserPosts() > 1)

                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size() +" "+ LocalDate.now());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);

        
       /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/
       /* Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/




        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/


        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
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
        NumbersGenerator.generateEven(20);*/



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
