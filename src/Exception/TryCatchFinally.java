package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file ...");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("file Found, processing the file...");
            System.out.println("End of the main logic");
        } catch(FileNotFoundException ex){
            System.out.println("File not Found caught...");
        }
        finally {
            System.out.println("Finally-block runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally, life goes on ...");
    }
}
