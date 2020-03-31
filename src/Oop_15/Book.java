package Oop_15;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price){
        this.author = author;
        this.name = name;
        this.price = price;
    }
    public Book(String name, Author[] author, double price, int qty){
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthor(){
        return this.author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public void setAuthor(Author[] author){
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                  name + ',' +
                "" + Arrays.toString(author) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorName(){
        String au = "";
        for(int i = 0; i < getAuthor().length; i++ ){
            au += getAuthor()[i].getName() + ", ";
        }
        return au;
    }
}
