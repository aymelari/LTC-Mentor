package lesson13;

public class PasswordMain {
    public static void main(String[] args)  throws InvalidPasswordException{
        Password password=new Password();


        try{
            password.validatePassword();
        }catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }


    }



}
