package Lession_16;

import org.w3c.dom.ls.LSOutput;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("radius is:" + cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base area is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0,2.0);
        System.out.println("radius is:" + cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base area is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume());
        Circle c1 = new Circle(2,"Blue");
        System.out.println(c1.getArea());


    }
}
