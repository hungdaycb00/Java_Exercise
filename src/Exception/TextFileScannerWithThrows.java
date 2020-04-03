package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileScannerWithThrows {
    public static void main(String[] args) {

            int num1;
            double num2;
            String name;
            try{Scanner in = new Scanner(new File("in.txt"));
                    num1 = in.nextInt();
                    name = in.next();
                    num2 = in.nextDouble();
                    System.out.printf(" Try %s, %d, %.2f %n", name, num1, num2);

            }
            catch (FileNotFoundException ex){
                    ex.printStackTrace();

            }
            finally {
                    System.out.println("ok");
            }

            System.out.println("ahwoooooo");

    }
}
