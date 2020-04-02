package Lession_19.Interface;

public class Rectangle implements Shape {
    private int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public double getCong(){
        return width + length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }


    public double getArea() {
        return width * length;
    }

}
