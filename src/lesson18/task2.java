package lesson18;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers.size());
        for (int i=numbers.size()-1; i >= 0;i--) {
            System.out.println(numbers.get(i));
        }

        if(numbers.contains(30)){
            System.out.println( "Element found" );
        }else
            System.out.println( "Element not found");

        numbers.remove(3);
        numbers.add(0,60);

        numbers.set(2,35);

        List<Integer> newArray=new ArrayList<>();
        newArray.add(70);
        newArray.add(80);
        newArray.add(90);

        numbers.addAll(newArray);
        Collections.sort(numbers);


        for(Integer n : numbers){
            System.out.println(n);
        }





    }
}
