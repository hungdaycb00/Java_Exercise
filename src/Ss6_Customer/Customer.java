package Ss6_Customer;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;


    public static void main(String[] args) {
        Customer ob1 = new Customer();

        ob1.customerID = 100;
        ob1.customerName = "John";
        ob1.customerAddress = "lkjh-ewrtr";
        ob1.customerAge = 30;
        System.out.println(ob1.customerAddress);

    }
}
