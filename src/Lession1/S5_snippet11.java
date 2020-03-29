package lessss01;

import java.util.Scanner;

public class S5_snippet11 {
    public static void main(String[] args) {
        int cnt, number;

        for (cnt = 1, number = 0; cnt <= 3; cnt++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if(number == 0){
                System.out.println("Good choice!!!");
                break;
            }
            else if(number == 3) {
                System.out.println("Game Over!!!");
            }
        }
    }
}
