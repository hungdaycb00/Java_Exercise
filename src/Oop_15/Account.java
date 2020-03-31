package Oop_15;

import org.w3c.dom.ls.LSOutput;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void Withdraw(double amount){
        if(balance > amount){
            balance = balance - amount;
        } else if(balance < amount){
            System.out.println("Cant withdraw");
        }
    }
    public String toString(){
        return String.format("%s balance = %.2f", customer.getName(),balance );
    }

}
