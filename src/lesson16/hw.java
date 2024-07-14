package lesson16;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the lenght of the password : ");
        int length = scanner.nextInt();
        Password password=new Password();
        password.generateRandomPassword(length);
        System.out.println(password.generateRandomPassword(length));
    }
}
