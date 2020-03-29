package lession3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class trycatchout {
    public static void main(String[] args) {
        try{
        Formatter out = new Formatter(new File("out.txt"));

        int num1 = 123;
        double num2 = 22.33;
        String name = "Thai";
        out.format("Hi %s, %n", name);
        out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
        out.close();
        System.out.println("Done");
    } catch(FileNotFoundException ex){
        ex.printStackTrace();
    }
}
}

