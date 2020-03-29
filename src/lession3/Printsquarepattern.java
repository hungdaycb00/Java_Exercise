package lession3;

import java.util.Scanner;

public class Printsquarepattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int row, col;
        for (row = 1; row <= n; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
