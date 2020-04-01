package Lession_19.Monster;

public class StaneMonster extends Monster {
    public StaneMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stone!";
    }
}
