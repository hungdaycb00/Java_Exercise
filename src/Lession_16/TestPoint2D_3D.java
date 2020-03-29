package Lession_16;

public class TestPoint2D_3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

        //setters and setters\
        p2a.setX(3);
        p2a.setY(5);
        System.out.println(p2a);
        System.out.println(p2a.getX() +","+ p2a.getY());

        Point3D p3a = new Point3D(11,12,13);
        System.out.println(p3a);
        p3a.setX(21);
        p3a.setY(34);
        p3a.setZ(34);
        System.out.println(p3a.getZ());
        System.out.println(p3a);
    }
}
