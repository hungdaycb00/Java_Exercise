package Oop;

public class Testbook {
    public static void main(String[] args) {
        Author manhHung = new Author("Manh Hung","Hung@ggg.com", 'm');
        System.out.println(manhHung);

        //Test Book's constructor and toString
        Book dummyBook = new Book("Java for dummies", manhHung, 9.99, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.22);
        dummyBook.setQty(456);

        System.out.println("Name is: " + dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter", "dsa@ghaskdff", 'f'),545.22,789);
        System.out.println(moreDummyBook);
    }
}
