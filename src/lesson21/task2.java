package lesson21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("hel", "world", "abcdefghjhujij", "1234567890", "short", "j");
        List<String> collect = input.stream()
                .filter(a -> a.length() <= 10)
                .sorted(Comparator.comparing(item ->item.length()))
                .collect(Collectors.toList());

        collect.forEach(a-> System.out.println(a));

    }
}
