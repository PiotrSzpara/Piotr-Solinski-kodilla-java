package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        if (shopping != null) {
            shopping.executeTask();
        }
        //Then
        assert shopping != null;
        assertTrue(shopping.isTaskExecuted());
        assertEquals("SHOPPING TASK", shopping.getTaskName());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        if (painting != null) {
            painting.executeTask();
        }
        //Then
        assert painting != null;
        assertTrue(painting.isTaskExecuted());
        assertEquals("PAINTING TASK", painting.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        if (driving != null) {
            driving.executeTask();
        }
        //Then
        assert driving != null;
        assertTrue(driving.isTaskExecuted());
        assertEquals("DRIVING TASK", driving.getTaskName());
    }
}

