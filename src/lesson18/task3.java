package lesson18;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);


        int sum=0;
        for(Integer n : arraylist){
            sum=sum+n;
        }

        int avg=sum/(arraylist.size());

        System.out.println(sum);
        System.out.println(avg);
    }

}
