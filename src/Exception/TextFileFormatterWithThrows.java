package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class TextFileFormatterWithThrows {
    public static void main(String[] args)
        throws FileNotFoundException{
            Formatter out = new Formatter(new File("out.txt"));
            int num1 = 123;
            double num2 = 55.55;
            String name = "Paul";
            out.format("Hi %s, %n", name);
            out.format(" Try %s, %d, %.2f", name, num1, num2);
            out.close();
            System.out.println("done");

    }
}
