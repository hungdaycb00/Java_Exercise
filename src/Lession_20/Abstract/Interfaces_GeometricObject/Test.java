package Lession_20.Abstract.Interfaces_GeometricObject;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.getArea();
        c1.getPerimeter();
        System.out.println(c1);

        ResiableCircle c2 = new ResiableCircle(5);
        c2.resize(110);
        System.out.println(c2);
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getArea());

    }
}
