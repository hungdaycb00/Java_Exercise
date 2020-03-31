package Oop_15;

import java.util.Arrays;

public class TestBook {

    public static void main(String[] args) {

        Author codelean = new Author("Code Lean", "Hung@gggg",'f');
        Author[] tacgia = new Author[2];
        tacgia[0] = new Author("Code Lean", "Hung@gggg",'f');
        tacgia[1] = new Author("yeyeye", "Hung@ddddd",'f');
        Book dummyBook = new Book("Java for", tacgia, 19.99,88);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + Arrays.toString(dummyBook.getAuthor()));
        Book anotherBook = new Book("More Jave", tacgia,99.99,199);
        System.out.println(Arrays.toString(anotherBook.getAuthor()));
    }
}
