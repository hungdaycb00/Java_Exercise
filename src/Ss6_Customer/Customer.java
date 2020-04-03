package Ss6_Customer;

import java.util.Scanner;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    char lop;

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerAge=" + customerAge +
                ", lop=" + lop +
                '}';
    }

    public static void main(String[] args) {
        Customer ob1 = new Customer();
        Scanner scanner = new Scanner(System.in);

        ob1.customerID = scanner.nextInt();
        ob1.customerName = scanner.next();
        ob1.customerAddress = scanner.next();
        ob1.customerAge = scanner.nextInt();
        ob1.lop = scanner.next().charAt(0);
        System.out.println(ob1);

    }
}
