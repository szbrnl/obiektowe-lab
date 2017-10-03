package agh.cs.lab1;

import static java.lang.System.out;



public class CarSystem {

    public static void main(String[] args)
    {
        out.println("Start");

        Direction[] directions = ConvertArgs(args);
        Run(directions);

        out.println("Stop");
    }

    public static void Run(Direction[] directions) {

        for(Direction direction : directions) {
            switch(direction) {
                case Backward:
                    out.println("Do tyłu");
                    break;
                case Forward:
                    out.println("Do przodu");
                    break;
                case Left:
                    out.println("W lewo");
                    break;
                case Right:
                    out.println("W prawo");
                    break;
            }
        }

    }

    public static Direction[] ConvertArgs(String[] args) {

        int i = 0;
        Direction[] result = new Direction[args.length];

        for(String s : args) {
            switch (s) {
                case "f":
                    result[i]=Direction.Forward;
                    break;
                case "b":
                    result[i]=Direction.Backward;
                    break;
                case "l":
                    result[i]=Direction.Left;
                    break;
                case "r":
                    result[i]=Direction.Right;
                    break;
            }
            i++;
        }
        return result;
    }


}
