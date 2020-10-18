package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;

    private List<String> generateUsersList(int usersQuantity) {
        List<String> usersNamesMock = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            usersNamesMock.add("newUser");
        }
        return usersNamesMock;
    }

    @Mock
    private Statistics statisticsMock;

    private static StatisticExecutor statisticExecutor;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Nested
    @DisplayName("Tests for posts")
    class TestsForPosts {
        @Test
        void testStatsFor0Posts() {
            // Given
            StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
            List<String> listOf100Users = generateUsersList(100);
            when(statisticsMock.usersNames()).thenReturn(listOf100Users);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            // When
            statisticExecutor.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(100, statisticExecutor.getUsersNumber());
            assertEquals(0, statisticExecutor.getPostsNumber());
            assertEquals(0, statisticExecutor.getCommentsNumber());
            assertEquals(0, statisticExecutor.getAverageNumberOfPostsPerUser());
            assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerUser());
            assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerPost());

        }

        @Test
        void testStatsFor1000Posts() {
            // Given

                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf100Users = generateUsersList(100);
                when(statisticsMock.usersNames()).thenReturn(listOf100Users);
                when(statisticsMock.postsCount()).thenReturn(1000);

                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(100, statisticExecutor.getUsersNumber());
                assertEquals(1000, statisticExecutor.getPostsNumber());
                assertEquals(10, statisticExecutor.getAverageNumberOfPostsPerUser());
            }

        }

        @Nested
        @DisplayName("Tests for comments")
        class TestsForComments {
            @Test
            void testStatsFor0Comments() {
                // Given
                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf100Users = generateUsersList(100);
                when(statisticsMock.usersNames()).thenReturn(listOf100Users);
                when(statisticsMock.postsCount()).thenReturn(1000);
                when(statisticsMock.commentsCount()).thenReturn(0);

                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then

                assertEquals(100, statisticExecutor.getUsersNumber());
                assertEquals(1000, statisticExecutor.getPostsNumber());
                assertEquals(0, statisticExecutor.getCommentsNumber());
                assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerUser());
                assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerPost());

            }

            @Test
            void testStatsForCommentsMoreThanPosts() {
                // Given
                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf100Users = generateUsersList(100);
                when(statisticsMock.usersNames()).thenReturn(listOf100Users);
                when(statisticsMock.postsCount()).thenReturn(1000);
                when(statisticsMock.commentsCount()).thenReturn(2000);

                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(100, statisticExecutor.getUsersNumber());
                assertEquals(1000, statisticExecutor.getPostsNumber());
                assertEquals(2000, statisticExecutor.getCommentsNumber());
                assertEquals(10, statisticExecutor.getAverageNumberOfPostsPerUser());
                assertEquals(20, statisticExecutor.getAverageNumberOfCommentsPerUser());
                assertEquals(2, statisticExecutor.getAverageNumberOfCommentsPerPost());

            }

            @Test
            void testStatsForCommentsLessThanPosts() {
                // Given
                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf100Users = generateUsersList(100);
                when(statisticsMock.usersNames()).thenReturn(listOf100Users);
                when(statisticsMock.postsCount()).thenReturn(1000);
                when(statisticsMock.commentsCount()).thenReturn(500);


                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(100, statisticExecutor.getUsersNumber());
                assertEquals(1000, statisticExecutor.getPostsNumber());
                assertEquals(500, statisticExecutor.getCommentsNumber());
                assertEquals(10, statisticExecutor.getAverageNumberOfPostsPerUser());
                assertEquals(5, statisticExecutor.getAverageNumberOfCommentsPerUser());
                assertEquals(0.5, statisticExecutor.getAverageNumberOfCommentsPerPost());

            }

        }

        @Nested
        @DisplayName("Tests for users")
        class TestsForUsers {
            @Test
            void testStatsFor0Users() {
                // Given
                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf0Users = new ArrayList<>();
                when(statisticsMock.usersNames()).thenReturn(listOf0Users);
                when(statisticsMock.postsCount()).thenReturn(0);
                when(statisticsMock.commentsCount()).thenReturn(0);

                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(0, statisticExecutor.getUsersNumber());
                assertEquals(0, statisticExecutor.getPostsNumber());
                assertEquals(0, statisticExecutor.getCommentsNumber());
                assertEquals(0, statisticExecutor.getAverageNumberOfPostsPerUser());
                assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerUser());
                assertEquals(0, statisticExecutor.getAverageNumberOfCommentsPerPost());

            }

            @Test
            void testStatsFor100Users() {
                // Given
                StatisticExecutor statisticExecutor = new StatisticExecutor(statisticsMock);
                List<String> listOf100Users = generateUsersList(123);
                when(statisticsMock.usersNames()).thenReturn(listOf100Users);
                when(statisticsMock.postsCount()).thenReturn(11235);
                when(statisticsMock.commentsCount()).thenReturn(123543);


                // When
                statisticExecutor.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(123, statisticExecutor.getUsersNumber());
                assertEquals(11235, statisticExecutor.getPostsNumber());
                assertEquals(123543, statisticExecutor.getCommentsNumber());
                assertEquals(91.34146341463415, statisticExecutor.getAverageNumberOfPostsPerUser());
                assertEquals(1004.4146341463414, statisticExecutor.getAverageNumberOfCommentsPerUser());
                assertEquals(10.996261682242991, statisticExecutor.getAverageNumberOfCommentsPerPost());

            }


        }
    }

