package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();

        //Then
        assertNotNull(shopping);
        assertTrue(shopping.isTaskExecuted());
        assertEquals("SHOPPING TASK", shopping.getTaskName());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();

        //Then
        assertNotNull(painting);
        assertTrue(painting.isTaskExecuted());
        assertEquals("PAINTING TASK", painting.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When

        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();

        //Then
        assertNotNull(driving);
        assertTrue(driving.isTaskExecuted());
        assertEquals("DRIVING TASK", driving.getTaskName());
    }
}

