package Lession_20.Abstract.Polymorphism;

import Lession_18.Up_downcasting.A;
import Lession_18.Up_downcasting.B;

import java.awt.*;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog Bdog1 = new BigDog();
        Bdog1.greeting();

        Animal a1 = new Cat();
        a1.greeting();
        Animal a2 = new Dog();
        a2.greeting();
        Animal a3 = new BigDog();
        a3.greeting();
//        Animal a4 = new Animal() {
//            @Override
//            public void greeting() {
//                System.out.println("Hello");
//            }
//        };
        Dog dog2 = (Dog)a2;             //downcast
        BigDog Bdog2 = (BigDog)a3;      //downcast
        Dog dog3 = (Dog)a3;             //downcast
//       Cat cat2 = (Cat)a2;
       dog2.greeting(dog3); //do dog3 là thuộc Bigdog mà dog2 là
        dog3.greeting(dog2);//woo
        dog2.greeting(Bdog2);//looix
        Bdog2.greeting(dog2);//Woo
        Bdog2.greeting(Bdog1); //Woo00
    }
}
