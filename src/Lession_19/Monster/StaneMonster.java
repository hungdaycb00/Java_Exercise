package Lession_19.Monster;

import Lession_19.Shape;

public class StaneMonster extends Monster {
    private int height;
    public StaneMonster(String name){
        super(name);
    }
    public double Ner(){
        return height;
    }
    @Override
    public String attack() {
        return "Attack with stone!";
    }
}
