package lessss01;

import java.util.Scanner;

public class S4_9 {
    enum Cards{
        Spade, Heart, Dinamond, Club
    }
    public static void main(String[] args) {


        Cards card = Cards.Dinamond;

        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Dinamond:
                System.out.println("DINAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }
    }
}
