package Oop_15;

import Lession4.Point;

public class MyPoint {
    private int x, y;

    //constructor
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    //getter and setter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                 x +
                "," + y +
                '}';
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(){
        return Math.sqrt(this.x * this.x +this.y * this.y);
    }
    public double distance(Point another){
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }



}
