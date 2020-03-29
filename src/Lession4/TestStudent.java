package Lession4;

public class TestStudent {
    public static void main(String[] args) {
        Student ahTeck = new Student("Tan Ah Krk", "1 Happe ve");
        System.out.println(ahTeck);

        ahTeck.setAddress("8 kg Java");
        System.out.println(ahTeck);
        System.out.println(ahTeck.getName());
        System.out.println(ahTeck.getAddress());


        //test addCourseGrade
        ahTeck.addCourseGrade("IM101", 89);
        ahTeck.addCourseGrade("IM102", 59);
        ahTeck.addCourseGrade("IM103", 99);

        ahTeck.printGrades();
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
    }
}
