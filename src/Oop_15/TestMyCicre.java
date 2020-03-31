package Oop_15;

import Lession4.Point;
import Oop.Circle;

public class TestMyCicre {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(2, 3, 3.3);
        System.out.println(c2);
        Circle c3 = new Circle(new Point(3,4),5.6);
        System.out.println(c3);

        c1.setCenter(new Point(55,66));
        c1.setRadius(5.5);
        System.out.println(c1);
        System.out.println("Center is: " + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterX(12);
        c1.setCenterY(13);
        System.out.println(c1);
        System.out.println("Center 's x is: " + c1.getCenterX());
        System.out.println("Center's y is: " + c1.getCenterY());
        c1.setCenterXY(1,2);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);
        System.out.println(c1);
        System.out.println(c2);
        System.out.printf("area is: %.2f%n", c1.distance(c2));
        System.out.printf("area is %.2f%n", c2.distance(c1));
    }
}
