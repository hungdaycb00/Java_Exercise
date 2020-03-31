package Oop_15;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(01,new Customer(99,"Hung",10 ),999);
        System.out.println(a1.getBalance());
        a1.Withdraw(9900);
        System.out.println(a1);
        a1.deposit(50);
        System.out.println(a1);
    }
}
