package Oop;

public class Author {
    private String name;
    private String email;
    private char gender;

    //Constructs a Author instance
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //the public getter and setter

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //Return a self-descriptive
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
