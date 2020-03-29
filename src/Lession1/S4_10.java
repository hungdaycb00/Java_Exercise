package lessss01;

public class S4_10 {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";

        switch (day){
            case "Sunday":
                System.out.println("Sunday is a holiday...");
                switch (hour){
                    case "am":
                        System.out.println("Good morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
            case "Monday":
                System.out.println("Monday is Working Day...");
                switch (hour){
                    case "am":
                        System.out.println("Good morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
            default:
                System.out.println("Invalid Day");
        }
    }
}
