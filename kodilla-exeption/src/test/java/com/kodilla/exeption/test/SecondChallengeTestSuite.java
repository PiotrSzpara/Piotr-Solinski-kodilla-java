package com.kodilla.exeption.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() throws Exception {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9999,1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,1.5));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1));




    }

}
