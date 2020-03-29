package lession3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class throwoutput {
    public static void main(String[] args)
        throws FileNotFoundException{
        Formatter out = new Formatter(new File("out.txt"));

        int num1 = 10;
        double num2 = 11.22;
        String name = "Manh Hung";
        out.format("Hi %s, %n", name);
        out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
        out.close();
        System.out.println("Done");
    }
}
