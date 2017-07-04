package com.example.user.movierankings;

/**
 * Created by user on 03/07/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String newTitle) {
        return title = newTitle;
    }

    public String getGenre() {
        return genre;
    }

    public String setGenre(String newGenre) {
        return genre = newGenre;
    }

    public int getRanking() {
        return ranking;
    }

    public int setRanking(int newRanking) {
        return ranking = newRanking;
    }

    public String toString() {
        return "Title: " + title + " Genre: " + genre + " Ranking: " + ranking;
    }



}
