package Oop_15;

import java.util.Calendar;

public class Customer {
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount){
        this.name = name;
        this.discount = discount;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public int getDiscount() {
        return discount;
    }
    public String getName(){
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                '}';
    }
}
