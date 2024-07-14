package lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numbers of students: ");
        int input=scanner.nextInt();
       int[] grades=new int [input];
        int sum=0;
        int i=0;


        while(i<input){

            try {
                System.out.println("enter the grade");
                int grade=scanner.nextInt();

                if(grade>100 || grade<0) throw new InvalidGradeException("invalid grade : ");
                else{
                    grades[i]=grade;

                    sum=sum+grades[i];
                    System.out.println(sum);
                    i++;
                }
            }catch (InputMismatchException e){
                System.out.println("invalid input ,enter a number");
                break;
            }


















    }}}





