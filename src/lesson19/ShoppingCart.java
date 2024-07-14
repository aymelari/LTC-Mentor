package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String,Double> cart=new HashMap<>();

        Scanner scanner=new Scanner(System.in);
        String input;
        Double price;
        Integer number;
        int i=0;

        System.out.println("enter the number of elements :");
        number= scanner.nextInt();
        do{

            System.out.println("enter the item name :");
            input = scanner.next();
            System.out.println(" price :");
            price= scanner.nextDouble();

            cart.put(input,price);
            i++;
        }while(i<number);

        Double sum= Double.valueOf(0);
        for(Map.Entry<String,Double> entry : cart.entrySet()){
            sum=sum+entry.getValue();
        }
        System.out.println("total cost is :" + sum);






    }
}
