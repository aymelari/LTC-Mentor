package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Map<String,Integer> count=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a sentence");
        String input=scanner.nextLine();

        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] array= input.split(" ");

        for(String word : array) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String,Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ":  frequency :" + entry.getValue());
        }

        }
}
