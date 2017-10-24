package agh.cs.lab3;

import javax.swing.text.html.Option;

/**
 * Created by student31 on 2017-10-10.
 */
public class CarSystem {
    public static void main(String args[]) {

        String[] s = {"f", "r", "b", "b", "b"};

        Car car = new Car();

        MoveDirection moveDirections[] = OptionsParser.parse(s);

        for(MoveDirection moveDirection : moveDirections) {
            car.move(moveDirection);
        }

        System.out.println(car);
    }
}
