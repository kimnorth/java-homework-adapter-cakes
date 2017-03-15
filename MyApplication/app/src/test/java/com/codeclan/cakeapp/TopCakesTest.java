package com.codeclan.cakeapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 15/03/2017.
 */

public class TopCakesTest {

    @Test
    public void getListTest() {
        TopCakes topCakes = new TopCakes();
        assertEquals(16, topCakes.getList().size());
    }

}
