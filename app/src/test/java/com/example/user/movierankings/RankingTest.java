package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class RankingTest {

    Ranking ranking;

    @Before
    public void before() {
        Movie[] topTen = new Movie[10];
    }



    @Test
    public void setupMovies() {
        ranking.setupRanking();
        assertEquals(10, ranking.listSize());
    }
}
