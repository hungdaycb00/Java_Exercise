package lessss01;

public class PrintLeapYears {
    public static void main(String[] args) {
        int minYear = 999;
        int maxYear = 2010;
        int leapYearSum = 0;

        int number = minYear;
        while (number <= maxYear){

            number += 4;
            leapYearSum++;
        }
        System.out.println("Tong so nam nhuan la " + leapYearSum);
    }
}
