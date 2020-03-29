package Lession4;

public class Student {
    private String name;
    private String address;

    //the course taken
    private String[] courses;
    private int[] grades;
    private int numCourses;
    private static final int MAX_COURSES = 30;

    //Cóntructor
    public Student(String name, String address){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numCourses = 0;
    }
    //The public getter and setters
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Describle this intance
    public String toString(){
        return name + "(" + address + ")";
    }
    //Add a course and grade
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    //Print all courses taken and
    public void printGrades(){
        System.out.print(name);
        for(int i = 0; i < numCourses; ++i){
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }
    //Compute the average grade
    public double getAverageGrade(){
        int I= 0, sum = 0;
        for(int i = 0; i < numCourses; ++i){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }

}
