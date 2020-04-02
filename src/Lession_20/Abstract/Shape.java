package Lession_20.Abstract;

abstract public class Shape {
    private String color;
    private boolean filled;

    //constructor
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //setter and getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // return to String
    public String toString(){
        return "Shape[color =" + color + ", filled = " + filled + "]";
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}
