package lesson10.r;

public class Caracter {
    String name;

    public Caracter(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("ATTACK");
    }

    public void useSpecialAbility(){
        System.out.println("SPECIAL ABILITY USED");
    }
}
