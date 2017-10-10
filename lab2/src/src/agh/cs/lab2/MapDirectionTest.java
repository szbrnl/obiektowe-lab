package agh.cs.lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by student31 on 2017-10-10.
 */
public class MapDirectionTest {

    @Test
    public void testToString() {
        assertEquals("(1,2)", new Position(1,2).toString());
        assertEquals("(-3,4)", new Position(-3,4).toString());
    }

    @Test
    public void testNext() {
        assertEquals(MapDirection.East, MapDirection.North.next());
        assertEquals(MapDirection.South, MapDirection.East.next());
        assertEquals(MapDirection.West, MapDirection.South.next());
        assertEquals(MapDirection.North, MapDirection.West.next());
    }

    @Test
    public void testPrevious() {
        assertEquals(MapDirection.East, MapDirection.South.previous());
        assertEquals(MapDirection.South, MapDirection.West.previous());
        assertEquals(MapDirection.West, MapDirection.North.previous());
        assertEquals(MapDirection.North, MapDirection.East.previous());
    }

}
