package Lession_17;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.getSide();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString(){
        return String.format("Square [%s]",super.toString());
    }

    public static void main(String[] args) {
        Square s1 = new Square(5,"blue",true);


        System.out.println(s1);

    }
}
