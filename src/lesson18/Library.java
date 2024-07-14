package lesson18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
    Set<Book> library=new HashSet<>() ;


    public Library(Set<Book> library) {
        this.library = library;
    }

    public void addBook(Book book){
        library.add(book);
    }

    public void removeBook(Book book){
        library.remove(book);
    }
    public Book findBookByIsbn(String isbn){
        Book result=null;
        for(Book book : library){
            if(book.isbn==isbn){
                result=book;
            }
        }
        return result;
    }


    public Set<Book> findBooksByAuthor(String author){
        Set<Book> foundBooks =new HashSet<>();
        for (Book book : library){
            if(book.author==author){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Set<Book> getAllBooks(){
        Set<Book> gottenBooks=new HashSet<>();
        for(Book book : library){
            gottenBooks.add(book);
        }
        return gottenBooks;
    }


}
