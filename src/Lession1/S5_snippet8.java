package lessss01;

public class S5_snippet8 {
    public static void main(String[] args) {
        int num = 1;
        boolean flag = true;
        for (; flag; num++){
            System.out.println("Value of num: " + num);
            if (num == 5){
                flag = false;
            }
        }
    }
}
