package lessss01;

import java.util.Scanner;

public class S4_Ex1_Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, gender, profession, asset, loan;
        System.out.println("Wellcom to Lifemaxi!!!");
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter your gender: \n 1. Male \n 2. Female ");
        gender = scanner.nextInt();
        System.out.println("Enter your profession: \n 1. Self-Employed \n 2. Professional \n 3. Retired");
        profession = scanner.nextInt();
        System.out.println("Enter your assets: ");
        asset = scanner.nextInt();
        if((age >= 16 && age < 26) && asset > 25000){
            switch (profession){
                case 1:
                    loan = 10000;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                case 2:
                    loan = 15000;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                default:
                    System.out.println("You don't have eligible!");
            }
        }
        else if((age >= 26 && age < 41) && asset > 40000){
            switch (gender){
                case 1:
                    loan = 25000;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                case 2:
                    loan = 30000;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                default:
                    System.out.println("You don't have eligible!");
            }
        }
        else if((age >= 41 && age <= 60) && asset > 50000){
                loan = 40000;
            System.out.println("Loan amount eligible: " + loan);
            }
        else if(age > 60 && asset > 25000){
            switch (profession){
                case 1:
                    loan = 35000 - age * 100;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                case 3:
                    loan = 25000 - age * 100;
                    System.out.println("Loan amount eligible: " + loan);
                    break;
                default:
                    System.out.println("You don't have eligible!");

            }
        }
        else{
            System.out.println("You don't have eligible!");
        }
    }
}
