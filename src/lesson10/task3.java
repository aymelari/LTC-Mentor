package lesson10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the sentence you want to reverse");

            String sentence = scanner.nextLine();
            if (sentence.equals("exit")) {
                break;
            }
            if (sentence.equals("") || sentence.equals(" ")) {

                System.out.println("please enter a sentence");
                sentence = scanner.nextLine();

            }


            String array[] = sentence.split(" ");
            char [] reversed =  new char[array.length];
            for (int i = 0; i < array.length; i++) {
                char[] charArray = array[i].toCharArray();

                int start = 0;
                int end = charArray.length - 1;

                while (start < end) {

                        char temp = charArray[start];
                        charArray[start] = charArray[end];
                        charArray[end] = temp;

                        start++;
                        end--;



                }



            }
        }
    }

}

