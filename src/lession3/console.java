package lession3;

import java.io.Console;
import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        Console con = System.console();
        if(con == null){
            System.err.println("Console Object is not available.");
            System.exit(1);
        }

        String name = con.readLine("Enter your Name: ");
        con.printf("Hello %s%n", name);

        Scanner in = new Scanner(con.reader());
        con.printf("Enter an integer: ");
        int anInt = in.nextInt();
        con.printf("The integer entered is %d%n", anInt);
        con.printf("Enter a floating point number: ");
        double aDouble = in.nextDouble();
        con.printf("The floating point number entered is %f%n", aDouble);
        in.close();
    }

}

