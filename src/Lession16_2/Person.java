package Lession16_2;

public class Person {
    private String name, address;

    //sonstructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //setter and getters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
