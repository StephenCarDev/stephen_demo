package me.stephen.demo4;

import java.util.ArrayList;

public class test4002 {
    public static void main(String[] args) {

        ArrayList<Movie> movie = new ArrayList<>();

        movie.add(new Movie("ShawShank", 9.7, "Jack"));
        movie.add(new Movie("BaWang", 9.6, "Jack"));
        movie.add(new Movie("ShawShank", 9.7, "Jack"));

        System.out.println(movie);
    }
}

class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}