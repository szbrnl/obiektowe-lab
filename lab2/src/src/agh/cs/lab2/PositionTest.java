package agh.cs.lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student31 on 2017-10-10.
 */
public class PositionTest {
    @Test
    public void smallerTest() {
        assertEquals(false, new Position(3,4).smaller(new Position(2,4)));
        assertEquals(true, new Position(-3,1).smaller(new Position(4,4)));
    }

    @Test
    public void largerTest() {
        assertEquals(true, new Position(3,4).larger(new Position(2,4)));
        assertEquals(false, new Position(2,1).larger(new Position(5,5)));
    }
}
