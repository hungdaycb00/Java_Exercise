package lessss01;

public class ArithmeticTest {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        //10.1
        System.out.printf("The sum, difference, product, quotient, remainder of %d and %d are %d, %d, %d, %d and %d \n", number1, number2, sum, difference, product, quotient, remainder);
        //10.2
        sum = 31 * number1 + number2 * 17;
        System.out.println("The sum is num1 * 31 and num2 * 17 is " + sum);
        //10.3
        int number3 = 77;
        int SumProduct3Numbers = number1 + number2 + number3;
        int Tich = SumProduct3Numbers*3;
        System.out.println("The sumProduct3Numbers is " + SumProduct3Numbers);
        System.out.println("The Tich 3 so la " + Tich);
    }
}
