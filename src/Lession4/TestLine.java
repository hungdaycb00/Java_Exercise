package Lession4;

import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1,2,3,4);
        System.out.println(l1);
        Line l2 = new Line(new Point(3,5), new Point(9,8));

        l1.setBeginXY(2,5);
        l1.setBegin(new Point(5,5));
        l1.setEnd(new Point(9,9));
        l1.setEndXY(8,8);
        System.out.println(l2 + " " + l1.getBegin() + " " + l1.getBeginXY()[1] + " " + l1.getBeginY());
        System.out.println("begin's x and y are: " +Arrays.toString(l1.getBeginXY()));
        System.out.println(l1.getLength());
    }
}
