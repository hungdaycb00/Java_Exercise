package lessss01;

public class RunningNumberSquareSum {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 100;
        int squareSum = 0;

        int number = minNum;
        while (number <= maxNum){
            squareSum = number * number + squareSum;
            number++;
        }
        System.out.println("The squareSum is " + squareSum);
    }
}
