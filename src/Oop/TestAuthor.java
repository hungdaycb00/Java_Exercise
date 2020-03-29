package Oop;

public class TestAuthor {
    public static void main(String[] args) {
        Author Hung = new Author("Manh Hung", "Hungcb@gmail.com", 'm');
        System.out.println(Hung);

        Hung.setEmail("Hung@haha.com");
        System.out.println(Hung);

        System.out.println("Name is " + Hung.getName());
        System.out.println("Gender is " + Hung.getGender());
        System.out.println("Email is " + Hung.getEmail());
    }
}
