package lesson17;

public class Book {
   private String title;
    private String author;
    BookCategory category;
   private double price;

    public Book(String title, String author, BookCategory category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
