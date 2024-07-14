package lesson13;

public class InvalidPasswordException extends  RuntimeException{
    public InvalidPasswordException(String message){
        super(message);
    }
}
