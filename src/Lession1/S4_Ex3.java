package lessss01;

import java.util.Scanner;

public class S4_Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your deposit amount: ");
        int deposit = scanner.nextInt();
        double interestEarn;
        if(deposit <= 2000){
            interestEarn = deposit * 4.0 / 100;
            System.out.println("Interest earm is a year: " + interestEarn);
        }
        else if(deposit <= 7000){
            interestEarn = deposit * 4.5 / 100;
            System.out.println("Interest earm is a year: " + interestEarn);
        }
        else if(deposit > 7000){
            interestEarn = deposit * 5.0 / 100;
            System.out.println("Interest earm is a year: " + interestEarn);
        }

    }
}
