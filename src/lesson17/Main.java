package lesson17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        InputValidator inputValidator=new InputValidator();
        inputValidator.isValid(input);

    }
}
