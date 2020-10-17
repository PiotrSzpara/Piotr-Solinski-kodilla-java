package com.kodilla.testing.forum.statistics;

public class StatisticExecutor {

    public StatisticExecutor(Statistics statistics) {
    }

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (postsNumber == 0 || usersNumber == 0){
            averageNumberOfPostsPerUser = 0;
        } else {averageNumberOfPostsPerUser = postsNumber/usersNumber;
        }

        if (commentsNumber == 0 || usersNumber == 0){
            averageNumberOfCommentsPerUser = 0;
        } else { averageNumberOfCommentsPerUser = commentsNumber/usersNumber;
        }

        if (postsNumber == 0 || commentsNumber == 0 || usersNumber == 0){
            averageNumberOfCommentsPerPost = 0;
        } else { averageNumberOfCommentsPerPost = (double) commentsNumber/postsNumber;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " +  averageNumberOfCommentsPerPost);
    }






}
