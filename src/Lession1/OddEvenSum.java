package lessss01;

public class OddEvenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int number = lowerbound;

        while (number <= upperbound){
            if(number % 2 == 0){
                sumOdd += number;
            } else {
                sumEven += number;
            }
            ++number;

        }
        System.out.println("The Sum Odd is " + sumOdd);
        System.out.println("The Sum Even is " + sumEven);
    }
}
