package Lession_20.Abstract;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
