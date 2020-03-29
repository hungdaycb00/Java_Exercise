package Oop;

import Lession4.Point;

public class Circle {
    private Point center;
    private double radius;

    //constructors
    public Circle(){
        this.center = new Point();
        this.radius = 1.0;
    }
    // Constructs a circle with center

    public Circle(int xCenter, int yCenter, double radius){
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    // Constructor a circle with the given point
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    //getter and setter
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Point getCenter(){
        return this.center;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    //returns a self-descriptive String
    public String toString(){
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }

    //Return the area of this circle
    public double getArea(){
        return Math.PI * radius *radius;
    }

    //Return the circumference of this circle
    public double getCircumference(){
        return 2.0*Math.PI*radius;
    }
    //Return the distance
    public double distance(Circle another){
        return center.distance(another.center);
    }
}
