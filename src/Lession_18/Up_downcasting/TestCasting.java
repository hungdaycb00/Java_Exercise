package Lession_18.Up_downcasting;

import org.w3c.dom.ls.LSOutput;

public class TestCasting {
    public static void main(String[] args) {
        A a1 = new C();
        System.out.println(a1);
        B b1 = (C) a1;
        System.out.println(a1);
        C c1 = (C) b1;
        System.out.println(b1);

        A a2 = new B();
        System.out.println(a2);
        B b2 = (B) a2;
        System.out.println(b2);
    }

}
