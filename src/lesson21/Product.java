package lesson21;

public class Product {
    String name;
    Double price;
    String category;

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product " +
                "name='" + name + '\'' +
                ", price=" + price
                ;
    }
}
