package lesson19;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String,Integer> count=new HashMap<>();
        String paragraph = "The quick brown fox jumped over the lazy dog, but the lazy dog didn't notice because the lazy dog was too busy sleeping.";
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] array= paragraph.split(" ");
       for(String word : array) {
           count.put(word, count.getOrDefault(word, 0) + 1);
       }

           for (Map.Entry<String,Integer> entry : count.entrySet()){
               if(entry.getValue()==1){
                   System.out.println(entry.getKey());
               }
           }








       }

    }

