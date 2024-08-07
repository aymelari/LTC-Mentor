package Lesson29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             UserRegistrationSystem userRegistrationSystem=new UserRegistrationSystem();

        Scanner scan=new Scanner(System.in);
        String answer="";
           while(!answer.equals("exit")) {
               System.out.println("selelct the operation u want to do");
               answer = scan.nextLine();
               if(answer.equals("register")){
                   userRegistrationSystem.registerUser();
               }
             else if(answer.equals("display")){
                 userRegistrationSystem.display();
               }

           }
    }
}
