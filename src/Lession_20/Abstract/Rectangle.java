package Lession_20.Abstract;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    public String toString(){
        return "Rectangle[" + super.toString() + ", width" + width + ", length = " + length + "]";
    }
}
