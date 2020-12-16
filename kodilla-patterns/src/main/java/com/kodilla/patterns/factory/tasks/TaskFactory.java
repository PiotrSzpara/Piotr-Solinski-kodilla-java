package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("SHOPPING TASK", "water", 6);
            case PAINTING_TASK:
                return new PaintingTask("PAINTING TASK", "blue", "bedroom");
            case DRIVING_TASK:
                return new DrivingTask("DRIVING TASK", "shop", "car");
            default:
                return null;
        }


    }
}
