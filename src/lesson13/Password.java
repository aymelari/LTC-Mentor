package lesson13;

import java.util.Scanner;

public class Password {





   public void validatePassword() throws InvalidPasswordException {

       Scanner scanner=new Scanner(System.in);
       String password=scanner.nextLine();
       if (!password.matches(".*[A-Z].*")) {
           throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
       }

       if (!password.matches(".*[a-z].*")) {
           throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
       }

       if (!password.matches(".*[0-9].*")) {
           throw new InvalidPasswordException("Password must contain at least one digit.");
       }
       if (password.length() < 8) {
           throw new InvalidPasswordException("Password must be at least 8 characters long.");
       }

   }






        }



