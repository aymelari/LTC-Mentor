package lesson30;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "978-0451524935", availabilityStatus.AVAILABLE);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", availabilityStatus.CHECKED_OUT);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", availabilityStatus.AVAILABLE);
        Book book4 = new Book("Moby Dick", "Herman Melville", "978-1503280786", availabilityStatus.CHECKED_OUT);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", "978-1503290563", availabilityStatus.AVAILABLE);

        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.checkOutBook(book1);
        library.checkOutBook(book1);
        library.checkOutBook(book5);


        library.returnBook(book4);


    }
}
