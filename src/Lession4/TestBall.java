package Lession4;

public class TestBall {
    public static void main(String[] args) {
        //Test constructor and toString
        Ball b1 = new Ball(1,2,11,12);
        System.out.println(b1);

        //Test setter and getter
        b1.setX(3);
        b1.setY(4);
        b1.setxStep(13);
        b1.setyStep(14);

        System.out.println(b1);

        //Test setXY
        b1.setXY(5,6);
        b1.setXYStep(15,16);
        System.out.println(b1);
        //Test move() and chaining
        System.out.println(b1.move());
        System.out.println(b1.move().move().move());

    }
}
