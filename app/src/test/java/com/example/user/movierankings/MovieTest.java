package com.example.user.movierankings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Star Wars", "Sci Fi", 1);
    }

    @Test
    public void canGetTitle() {
        assertEquals("Star Wars", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        assertEquals("The Empire Strikes Back", movie.setTitle("The Empire Strikes Back"));
    }

    @Test
    public void canGetGenre() {
        assertEquals("Sci Fi", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        assertEquals("Horror", movie.setGenre("Horror"));
    }

    @Test
    public void getMovieRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        assertEquals(2, movie.setRanking(2));
    }

    @Test
    public void testToString() {
        assertEquals("Title: Star Wars Genre: Sci Fi Ranking: 1", movie.toString());
    }




}
