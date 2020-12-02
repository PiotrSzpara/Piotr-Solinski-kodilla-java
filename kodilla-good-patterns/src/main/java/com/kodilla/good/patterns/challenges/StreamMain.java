package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        movieMap.forEach((key, value) -> System.out.println(key + " ! " + String.join(" ! ", value)));

        final String movies = movieMap.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movies);



    }
}
