package lessss01;

public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        int minnum = 1;
        int maxnum = 1000;
        int tongChiaHetCho7 = 0;

        int number = 0;
        while (number <= maxnum){
            tongChiaHetCho7 = tongChiaHetCho7 + number;
            number += 7;
            System.out.println(tongChiaHetCho7);
        }
        System.out.println("Tong chia het cho 7 la " + tongChiaHetCho7);
    }
}
