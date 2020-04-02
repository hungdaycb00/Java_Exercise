package Lession_20.Abstract;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle( double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    //getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0.5 * radius * Math.PI;
    }
    public String toString(){
        return "Circle[" + super.toString() + ", radius = " + radius + "]";
    }

}
