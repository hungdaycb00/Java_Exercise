package Oop_15;

import Lession4.Point;
import Oop.Circle;

public class MyCircle {
    private Point center;
    private int radius;
    public MyCircle(){
        center = new Point();
        this.radius = 1;
    }
    public MyCircle(int x,int y, int radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }
    public MyCircle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    //setter and getter

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
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
        int[] results = new int[2];
        results[0] = this.getCenterX();
        results[1] = this.getCenterY();
        return results;
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    //return string
    public String toString(){
        return "MyCircle[radius = " + radius + ", center= " + center + "]";
    }
    public double getArea(){
        return Math.PI * radius *radius;
    }

    //Return the circumference of this circle
    public double getCircumference(){
        return 2.0*Math.PI*radius;
    }
    //Return the distance
    public double distance(MyCircle another){
        int xDiff = center.getX() - another.getCenterX();
        int yDiff = center.getY() - another.getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }


}
