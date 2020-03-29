package lessss01;

import java.util.Scanner;

public class S5_ex3 {
    public static void check(int numMin, int numMax) {
        int i, j;
        for (i = numMin + 1; i <= numMax; i++) {
            for (j = 2; j < i ; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if(i == j) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int numMin, numMax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Min number: ");
        numMin = scanner.nextInt();
        System.out.println("Enter Max number: ");
        numMax = scanner.nextInt();
        check(numMin,numMax);

    }
}
