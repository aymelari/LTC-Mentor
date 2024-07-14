package lesson21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class productMain {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        Product product1 = new Product("Laptop", 999.99, "Electronics");
        Product product2 = new Product("Smartphone", 799.99, "Electronics");
        Product product3 = new Product("Desk Chair", 149.99, "Furniture");
        Product product4 = new Product("Book", 19.99, "Books");
        Product product5 = new Product("Headphones", 199.99, "Electronics");
        Product product6 = new Product("Coffee Maker", 89.99, "Appliances");
        Product product7 = new Product("Notebook", 2.99, "Stationery");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);

        List<Product> electronics = productList.stream()
                .filter(a -> a.category.equals("Electronics"))
                .sorted(Comparator.comparing(item -> item.price))
                .collect(Collectors.toList());


        electronics.forEach(b-> System.out.println(b));


    }
}
