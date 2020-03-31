package Oop_15;

import java.util.Arrays;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice iv1 = new Invoice(10, new Customer(01,"Hùng Mạnh", 10),1000);
        System.out.println(iv1.getAmountAfterDiscount());
        System.out.println(iv1.getCustomer());
    }
}
