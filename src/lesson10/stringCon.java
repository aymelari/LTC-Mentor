package lesson10;

import java.util.Scanner;

public class stringCon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string");
        String s1=scanner.next();
        System.out.println("enter how many times you want to concat");
        int say= scanner.nextInt();
        String cavab="";


       for(int i=0;i<say;i++){
           cavab=cavab+s1;
    }
        System.out.println(cavab);
    }
}
