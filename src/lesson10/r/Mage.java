package lesson10.r;

public class Mage extends Caracter{
    int intellect;

    public Mage(String name, int intellect) {
        super(name);
        this.intellect = intellect;
    }

    @Override
    public void attack() {

        super.attack();
        System.out.println(intellect+"% damage");

    }

    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
        System.out.println("telepathic illusion");

    }
}
