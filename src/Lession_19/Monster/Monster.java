package Lession_19.Monster;

abstract public class Monster {
    private String name;

    public Monster(String name){
        this.name = name;
    }
    abstract public String attack();
}
