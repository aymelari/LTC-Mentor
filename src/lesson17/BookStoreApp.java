package lesson17;

public class BookStoreApp {
    public static void main(String[] args) {
        Book book1=new Book("sdhfhj","fyodor",BookCategory.NON_FICTION,34.5);
        Book book2=new Book("djfdjkf","kafka",BookCategory.HISTORY,39);
        Book book3=new Book("aknkkhf","tolstoy",BookCategory.SCIENCE,23);

        BookStore store=new BookStore();

        store.addBook(book1);
        store.addBook(book2);
        store.addBook(book3);

        store.listBook();

        System.out.println("searched book:");
        store.searchBook(BookCategory.SCIENCE);
        store.searchBook(BookCategory.FANTASY);



    }
}
