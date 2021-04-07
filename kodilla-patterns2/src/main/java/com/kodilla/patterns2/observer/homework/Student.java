package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private final String studentName;
    private final List<Observer> observers;
    private List<String> homeworks;

    public Student(String studentName) {
        this.studentName = studentName;
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
    }

    public void addHomework(String homeworkNo) {
        homeworks.add(homeworkNo);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public  void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }
}
