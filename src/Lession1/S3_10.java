package lessss01;

import javax.print.attribute.standard.PresentationDirection;

public class S3_10 {

    enum Direction {
        East, West, North, South
    }

    public static void main(String[] args) {
        Direction direction;
        direction = Direction.East;

        System.out.println("Value: " + direction);
    }
}
