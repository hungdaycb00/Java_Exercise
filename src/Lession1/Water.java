package lessss01;

import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total Water: ");
        long totalWater = scanner.nextLong();

        System.out.println("Enter k: ");
        int k = scanner.nextInt();
        long cupOfWater;
        if(totalWater <= Math.pow(10,18)){
            cupOfWater = totalWater / k;
            System.out.println("Cup of water is: " + cupOfWater );
        } else
            {
            cupOfWater = -1;
                System.out.printf("Cup of water is: %d",cupOfWater );
        }
    }
}
