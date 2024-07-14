package lesson12_3;

public class Dairy extends Product{

    public Dairy(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return " dairy product cost "  + getCost();
    }
}
