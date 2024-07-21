package lesson22.exercise;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    List<Product> products=new ArrayList<>();
    public void addProduct(Product... products){
        for(Product product : products)
        this.products.add(product);
    }
    public void removeProduct(Long productId,Double amount){
       for(Product product : products){
           if(product.id==productId){
               product.amount= product.amount-amount;
           }
       }

    }
}
