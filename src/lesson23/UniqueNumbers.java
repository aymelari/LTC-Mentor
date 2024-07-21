package lesson23;

import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        UniqueNumbers numbers=new UniqueNumbers();
        ArrayList<Integer> integers = numbers.generateRandomNumbers(50, 3, 10);
        System.out.println("random numbers");
        integers.forEach(p -> System.out.println(p));

        HashSet<Integer> uniqueNumbers = numbers.getUniqueNumbers(integers);
        System.out.println("unique numbers");
        uniqueNumbers.forEach(System.out::println);






    }
    ArrayList<Integer> numbers=new ArrayList<>();
public ArrayList<Integer> generateRandomNumbers(int count,int min,int max){
    Random random=new Random();
    ArrayList<Integer> numbers=new ArrayList<>();
    for (int i = 0; i <=count; i++) {
        Integer num= random.nextInt(min,max);
        numbers.add(num);
    }
    return numbers;
}

public HashSet<Integer> getUniqueNumbers(ArrayList<Integer> numbers){
    HashSet<Integer> uniqueNumbers=new HashSet<>();
    for(Integer num : numbers){
        uniqueNumbers.add(num);
    }
    return uniqueNumbers;

}
}
