package lesson18;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Book> books=new HashSet<>();
        Library library=new Library(books);

        Book book1=new Book("SDJFH36G37","ANNA K.","Tolstoy");
        Book book2=new Book("KJJB36G468","nausea","Sartre");
        Book book3=new Book("LNICIDH36G3677","L'etranger","Camus");
        Book book4=new Book("36G3FTDY7","crime and punishment","Fyodor");
        Book book5=new Book("JSDFJBD6773TR","notes from underground","Fyodor");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        library.removeBook(book3);
        Book bookByIsbn = library.findBookByIsbn("36G3FTDY7");
        System.out.println(bookByIsbn);
        library.findBooksByAuthor("Fyodor");
        library.getAllBooks();



    }
}
