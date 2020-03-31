package Lession_17;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
    super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width * length;
    }
    public double Perimeter(){
        return (width + length) * 2;
    }
    public String toString(){
        return String.format("Rectangle [%s, width = %.2f, length = %.2f]",super.toString(),width,length);
    }

}
