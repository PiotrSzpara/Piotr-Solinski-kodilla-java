package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given

        //When"log no. 1"
        Logger.INSTANCE.log("log no. 1");
        String lastLog = Logger.INSTANCE.getLastLog();

        //Then
        assertEquals("log no. 1", lastLog);
    }
}
