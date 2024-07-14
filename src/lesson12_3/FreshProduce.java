package lesson12_3;

public class FreshProduce extends Product {


    public FreshProduce(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return " Freshproduct cost "+ getCost();
    }
}
