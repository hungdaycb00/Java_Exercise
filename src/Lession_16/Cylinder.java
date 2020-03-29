package Lession_16;

import java.util.zip.CheckedInputStream;

public class Cylinder extends Circle {
    private double height;
    //Constructors
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }
    //getter and setter
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    //return the volume of this Cylinder


    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }


}
