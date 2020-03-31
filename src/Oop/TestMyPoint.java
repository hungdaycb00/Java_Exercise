package Oop;

import Oop_15.MyPoint;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(12,35);
        System.out.println(mp1);
        MyPoint mp2 = new MyPoint();
        System.out.println(mp2);

        mp2.setX(1);
        mp2.setY(2);
        mp1.setXY(5,6);
        System.out.println("Point 1:" + mp1 + "Point 2: " + mp2);
        System.out.println(Arrays.toString(mp1.getXY()));
        MyPoint[] points = new MyPoint[3];
        points[0] = new MyPoint(1,2);
        points[1] = new MyPoint(3,4);
        points[2] = new MyPoint(5,6);


        System.out.println(Arrays.toString(points));


    }
}
