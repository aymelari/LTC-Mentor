package lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<customer> list=new ArrayList<>();
        customer c1 = new customer("Alice", 30, 1, "Bachelor's");
        customer c2 = new customer("Bob", 25, 2, "Master's");
        customer c3 = new customer("Charlie", 35, 3, "PhD");
        customer c4 = new customer("David", 28, 4, "Bachelor's");
        customer c5 = new customer("Eva", 40, 5, "Master's");
        customer c6 = new customer("Frank", 22, 6, "Bachelor's");
        customer c7 = new customer("Grace", 33, 7, "PhD");
        customer c8 = new customer("Hank", 29, 8, "Master's");
        customer c9 = new customer("Ivy", 26, 9, "Bachelor's");
        customer c10 = new customer("Jack", 31, 10, "PhD");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);

        Collections.sort(list, new Comparator<customer>() {
            @Override
            public int compare(customer c1, customer c2) {
                return c1.getAge().compareTo(c2.getAge());
            }
        });

        for(customer customer : list){
            System.out.println(customer);
        }

    }
}
