package lesson12_3;

public class Meat extends Product{

    public Meat(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return " meat product cost  " + getCost();
    }
}
