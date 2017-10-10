package agh.cs.lab2;

/**
 * Created by student31 on 2017-10-10.
 */
public class CarSystem {
    public static void main(String args[]) {
        MapDirection north = MapDirection.North;
        MapDirection west = MapDirection.West;
        MapDirection east = MapDirection.East;
        MapDirection south = MapDirection.South;

        System.out.println(north.next());
        System.out.println(west.next());
        System.out.println(south.next());
        System.out.println(west.next());

        System.out.println(north.previous());
        System.out.println(west.previous());
        System.out.println(south.previous());
        System.out.println(west.previous());

        Position pos = new Position(1,4);
        System.out.println(pos);

    }
}
