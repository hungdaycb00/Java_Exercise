package Lession_17;

import Oop.Circle;

import java.util.Arrays;

public class Cicle extends Shape {
    private double radius;

    public Cicle(){
        super();
        this.radius = 1.0;
    }
    public Cicle(double radius){
        super();
        this.radius = radius;
    }
    public Cicle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return radius * Math.PI;
    }

    public String toString(){
        return String.format("Circle[Shape[%s], radius = %.2f]", super.toString(),radius);
    }

}
