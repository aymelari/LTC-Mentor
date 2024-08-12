package lesson30;

public class Book {
    String title;
    String author;
    String ISBN;
     availabilityStatus  a;

    public Book(String title, String author, String ISBN, availabilityStatus a) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.a = a;
    }
}
