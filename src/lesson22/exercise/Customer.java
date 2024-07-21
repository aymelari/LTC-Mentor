package lesson22.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {
    String name;
    Double budget;
    List<Product> basket=new ArrayList<>();

    public Customer(String name, Double budget) {
        this.name = name;
        this.budget = budget;

    }


    public void doShoppingIn(SuperMarket store){
        List<Product> products=store.products;
        products.sort(Comparator.comparingDouble(p->p.price));

        for(Product p: products){
            if(budget>= p.price){
                Double maxAmountCanBeBought=Math.floor(budget/p.price);
                Double AmountThatBought=Math.min(maxAmountCanBeBought,p.amount);

                if(AmountThatBought>0){
                    Product productThatBought=new Product(p.id,p.name,p.price,AmountThatBought);
                    basket.add(productThatBought);
                    store.removeProduct(p.id, AmountThatBought);
                    budget=budget-AmountThatBought*p.price;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", basket=" + basket +
                '}';
    }
}
