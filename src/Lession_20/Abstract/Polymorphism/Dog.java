package Lession_20.Abstract.Polymorphism;

import java.sql.SQLOutput;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("À húuuuuuu!!!!!!");

    }
    public void greeting(Dog another){
        System.out.println("Wooooo!!!!!");
    }
}
