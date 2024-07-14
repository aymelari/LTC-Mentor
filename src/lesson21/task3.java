package lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5, 2, 8, 1, 9, 3, 2, 8, 5);
        List<Integer> collect = integerList.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println( "Distinct numbers in ascending order: [resulting list]");
         collect.forEach(System.out::println);

    }
}
