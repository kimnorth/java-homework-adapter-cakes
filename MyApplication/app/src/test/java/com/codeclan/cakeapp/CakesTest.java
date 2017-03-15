package com.codeclan.cakeapp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class CakesTest {

    Cake cake;

    @Before
    public void before() {
        cake = new Cake(1, "Apple Turnover");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, cake.getRanking());
    }

    @Test
    public void getNameTest() {
        assertEquals("Apple Turnover", cake.getName());
    }

}
