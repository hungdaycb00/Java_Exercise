package Lession4;

public class Account {
    private int accountNumber;
    private double balance;

    //the constructors
    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
// the public getter/setter
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public  void setBalance(double balance){
        this.balance = balance;
    }

    //add the given amount to the balance.
    public void credit(double amount){
        balance += amount;
    }

    public void debit(double amount){
        if(balance < amount){
            System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            balance -= amount;
        }
    }

    public String toString(){
        return String.format("A/C no:%d, Balance = %.2f", accountNumber, balance);
    }
}
