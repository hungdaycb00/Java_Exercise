package lessss01;

import java.util.Scanner;

public class S3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int intValue = scanner.nextInt();

        System.out.println("Enter a decimal number: ");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter a String value");
        String strValue = scanner.next();

        System.out.println("Values entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}
