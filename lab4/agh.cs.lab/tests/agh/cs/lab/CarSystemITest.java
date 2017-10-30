package agh.cs.lab;

public class CarSystemITest {


    public static void test() {
        String[] s = {"f", "r", "b", "b", "b"};

        Car car = new Car();


        MoveDirection moveDirections[] = OptionsParser.parse(s);
        assert (moveDirections.equals(new MoveDirection[]{MoveDirection.Forward, MoveDirection.Right, MoveDirection.Backward, MoveDirection.Backward, MoveDirection.Backward}));

        for(MoveDirection moveDirection : moveDirections) {
            car.move(moveDirection);
        }

        System.out.println(car);
    }

}
