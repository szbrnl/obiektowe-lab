package agh.cs.lab;

import javax.swing.text.html.Option;

/**
 * Created by student31 on 2017-10-10.
 */
public class    CarSystem {
    public static void main(String args[]) {

//        String[] s = {"f", "r", "b", "b", "b"};
//
        String[] s = {"f", "b", "r", "l" ,"f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f"};
////        Car car = new Car();
//
//        MoveDirection moveDirections[] = OptionsParser.parse(s);
//
//        for(MoveDirection moveDirection : moveDirections) {
//            car.move(moveDirection);
//        }
//
//        System.out.println(car);


        MoveDirection[] directions = new OptionsParser().parse(s);
        IWorldMap map = new RectangularMap(10, 5);
        map.place(new Car(map));
        map.place(new Car(map,3,4));
        map.run(directions);

        System.out.println(map.toString());

    }
}
