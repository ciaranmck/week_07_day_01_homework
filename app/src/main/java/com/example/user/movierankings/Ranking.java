package com.example.user.movierankings;


/**
 * Created by user on 03/07/2017.
 */

public class Ranking {

   private Movie[] topTen;

    public Ranking() {
        this.topTen = new Movie[10];
    }

    public void setupRanking() {
        Movie movie1 = new Movie("Star Wars", "Sci Fi", 1);
        Movie movie2 = new Movie("The Empire Strikes Back", "Sci Fi", 2);
        Movie movie3 = new Movie("Return of the Jedi", "Sci Fi", 3);
        Movie movie4 = new Movie("Die Hard", "Action", 4);
        Movie movie5 = new Movie("Die Hard 2", "Action", 5);
        Movie movie6 = new Movie("Die Hard 3", "Action", 6);
        Movie movie7 = new Movie("Die Hard 4", "Action", 7);
        Movie movie8 = new Movie("Alien", "Horror", 8);
        Movie movie9 = new Movie("Aliens", "Horror", 9);
        Movie movie10 = new Movie("Alien 3", "Horror", 10);

        Movie[] defaultmovies = {
                movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10
        };

        for (Movie movie : defaultmovies) {
            this.addMovie(movie);
        }
    }

    public int listSize() {
        int count = 0;
        for (Movie movie : topTen) {
            if (movie != null) {
                count++;
            }
        }
        return count;
    }

    public void addMovie(Movie movie) {
        topTen[movie.getRanking() - 1] = movie;
    }


}
