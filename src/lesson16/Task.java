package lesson16;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        StringBuilder username=new StringBuilder();
         username.append(input);

         for(int i=1;i<username.length();i=i+2){
             username.setCharAt(i,'-');

         }

         username.repeat(username.length()-1,2);

        System.out.println(username);

    }
}
