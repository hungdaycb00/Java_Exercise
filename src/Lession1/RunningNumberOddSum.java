package lessss01;

public class RunningNumberOddSum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int oddSum = 0;

        int number = 1;
        while(number <= upperbound) {
            oddSum = oddSum + number;
            number +=2;
        }

        System.out.println("The Odd sum from " + lowerbound + " to " + upperbound + " is " + oddSum);
    }

}
