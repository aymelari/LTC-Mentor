package lesson22;

import java.util.HashSet;
import java.util.Set;

public class classWork {
    public static void main(String[] args) {

        Integer[] array1={1, 2, 3, 4, 5};
        Integer[] array2={4, 5, 6, 7, 8};

        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();

        for(Integer i : array1){
            set1.add(i);
        }

        for(Integer i : array2){
            set2.add(i);
        }
        Set<Integer> union = new HashSet<>(set1);
union.addAll(set2);
        for(Integer i : union){
            System.out.println(i);
        }
        System.out.println("...................");


        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        for(Integer i : intersection){
            System.out.println(i);
        }
        System.out.println("...................");


        for(Integer i : union){
            if(!intersection.contains(i)){
                System.out.println(i);
            }
        }



    }


}
