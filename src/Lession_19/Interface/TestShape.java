package Lession_19.Interface;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Triangle(5,15);
        Shape s2 = new Rectangle(10,20);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        Triangle s3 = new Triangle(1,2);


    }
}
