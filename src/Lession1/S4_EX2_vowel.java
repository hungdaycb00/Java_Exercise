package lessss01;

import java.util.Scanner;

public class S4_EX2_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter;
        System.out.println("Enter letter: ");
        letter = scanner.nextLine();
        char ch = letter.charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println(ch + "is Vowel");
        }
        else if( ch == 'b' || ch == 'B' || ch == 'c' || ch == 'C' || ch == 'd' || ch == 'D' || ch == 'f' || ch == 'F' || ch == 'g' || ch == 'G' ||ch == 'h' || ch == 'H' || ch == 'j' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'm' || ch == 'M' || ch == 'n' || ch == 'N' ||
                ch == 'p' || ch == 'P' || ch == 'q' || ch == 'Q' || ch == 'r' || ch == 'R' || ch == 's' || ch == 'S' || ch == 'T' || ch == 'v' ||ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z' || ch == 'Z' || ch == 'Y' || ch == 'X' || ch == 'W' || ch == 'V')
            {
            System.out.println(ch + " is consonant");

        }
    }
}
