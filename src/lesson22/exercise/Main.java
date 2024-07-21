package lesson22.exercise;

public class Main {
    public static void main(String[] args) {
        SuperMarket superMarket=new SuperMarket();
        superMarket.addProduct(
                new Product(1L, "Milk", 1.5, 10.0),
                new Product(2L, "Bread", 1.0, 20.0),
                new Product(3L, "Eggs", 0.2, 30.0),
                new Product(4L, "Cheese", 3.0, 15.0)
        );

        Customer customer=new Customer("John Doe", 20.0);
        customer.doShoppingIn(superMarket);

        System.out.println(customer);
    }
}
