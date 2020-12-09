package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "task to do";
        board.getToDoList().addTask(taskToDo);
        String taskInProgress = "task in progress";
        board.getInProgressList().addTask(taskInProgress);
        String taskDone = "task done";
        board.getDoneList().addTask(taskDone);

       //Then
        Assert.assertEquals("task to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("task done", board.getDoneList().getTasks().get(0));

    }
}
