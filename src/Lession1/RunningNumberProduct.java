package lessss01;

public class RunningNumberProduct {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;
        int Tich = 1;
        int number = minNum;
        while ( number <= maxNum){
            Tich = Tich*number;
            number++;
            System.out.println(Tich + " = " + Tich + " * " + number);
        }
        System.out.println("Tich cac so tu 1 - 10 la " + Tich);
    }
}
