package lessss01;

import java.util.Scanner;

public class S5_ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do{
            double result;
            int continues;
            System.out.println("Enter number 1: ");
            double num1 = scanner.nextFloat();
            System.out.println("Enter number 2: ");
            double num2 = scanner.nextFloat();
            System.out.println("Enter the caculation: \"+\" \"-\" \"*\" \":\"");
            char caculation = scanner.next().charAt(0);

            switch (caculation){
                case '+':
                    result = num1 + num2;
                    System.out.printf("The result: %.2f %c %.2f = %.2f",num1, caculation, num2, result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.printf("The result: %.2f %c %.2f = %.2f",num1, caculation, num2, result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.printf("The result: %.2f %c %.2f = %.2f",num1, caculation, num2, result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.printf("The result: %.2f %c %.2f = %.2f",num1, caculation, num2, result);
                    break;
            }

            System.out.println("\nDo you want to calculate further? \n1: Yes\n2. No");
             continues = scanner.nextInt();
             if(continues == 1){
                 System.out.println("Continues...");
             }
             else {
                 System.out.println("Thanks you!");
                 break;
             }

        }
            while (true);
    }
}
