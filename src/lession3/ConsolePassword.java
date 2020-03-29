package lession3;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ConsolePassword {
    static String login;
    static char[] password;

    public static void main(String[] args) {
        Console con = System.console();
        if (con == null){
            System.err.println("Console Object is not available.");
            System.exit(1);
        }

        login = con.readLine("Enter your login Name: ");
        password = con.readPassword("Enter your password: ");
        if(checkPassword(login, password)){
            Arrays.fill(password, ' ');

        }
    }

        static boolean checkPassword(String login, char[] password){
        return true;
        }
}
