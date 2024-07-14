package lesson10.r;

public class Warrior extends Caracter{
    int strength;

    public Warrior(String name, int strength) {
        super(name);
        this.strength = strength;
    }

    @Override
    public void attack() {

        super.attack();
        System.out.println(strength+"% damaged");
    }

    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
        System.out.println("gave superhit");
    }
}
