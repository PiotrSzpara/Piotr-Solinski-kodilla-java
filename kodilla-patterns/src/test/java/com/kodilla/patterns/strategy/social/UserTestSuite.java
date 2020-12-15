package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam F. Book");
        User john = new YGeneration("John T. Witter");
        User betty = new ZGeneration("Betty S. Napchat");

        //When
        String adamPublish = adam.sharePost();
        System.out.println("Adam share post on: " + adamPublish);
        String johnPublish = john.sharePost();
        System.out.println("John share post on: " + johnPublish);
        String bettyPublish = betty.sharePost();
        System.out.println("Betty share post on: " + bettyPublish);

        //Then
        assertEquals("Facebook", adamPublish);
        assertEquals("Twitter", johnPublish);
        assertEquals("Snapchat", bettyPublish);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam F. Book");

        //When
        String adamPublish = adam.sharePost();
        System.out.println("Adam share post on: " + adamPublish);
        adam.setPublishingStrategy(new TwitterPublisher());
        adamPublish = adam.sharePost();
        System.out.println("Adam now share post on: " + adamPublish);

        //Then
        assertEquals("Twitter", adamPublish);
    }
}
