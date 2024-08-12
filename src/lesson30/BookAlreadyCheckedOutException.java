package lesson30;

public class BookAlreadyCheckedOutException extends RuntimeException{
    public BookAlreadyCheckedOutException(String message) {
        super(message);
    }
}
