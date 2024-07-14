package lesson13;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username");
        String password = scanner.next();
        System.out.println("enter your password");
        String name = scanner.next();

       Login login=new Login("Aysu","aysu123");
     try {
         login.login(name, password);

     }
     catch (AuthenticationExceptionis e){
         System.out.println(e.getMessage());
     }




    }






}