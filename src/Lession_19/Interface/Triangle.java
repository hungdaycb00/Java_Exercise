package Lession_19.Interface;

import Lession_18.Rectangle;

public class Triangle implements Shape {
    private int base, height;

    //constructor
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public double getCong(){
        return base + height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }

}
