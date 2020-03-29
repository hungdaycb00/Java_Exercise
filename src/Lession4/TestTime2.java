package Lession4;

public class TestTime2 {
    public static void main(String[] args) {
        Time t1 = new Time(1,2,3);
        System.out.println(t1);

        Time t2 = new Time(12,59,12);
        try {
            Time t3 = new Time(12, 59, 60);

            System.out.println("This line will be skipped, if exception occur");
        } catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("Continue after exception!");
    }
}
