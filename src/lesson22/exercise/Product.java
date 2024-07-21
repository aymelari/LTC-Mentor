package lesson22.exercise;

public class Product {
    long id;
    String name;
    Double price;
    Double amount;

    public Product(Long id, String name, Double price, Double amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
