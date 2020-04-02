package Lession_20.Abstract;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getArea());

        Circle c1 = (Circle)s1;
        System.out.println(c1.getRadius());
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1);

        Shape s4 = new Square(6.5);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());
    }
}
