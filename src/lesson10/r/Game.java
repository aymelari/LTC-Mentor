package lesson10.r;

public class Game {
    public static void main(String[] args) {
        Warrior warrior=new Warrior("Gorak",44);
        Mage mage=new Mage("Elara",79);
        warrior.attack();
        warrior.useSpecialAbility();

        mage.attack();
        mage.useSpecialAbility();
    }
}
