package lesson17;

public class BookStore {
    Book[] books=new Book[3];
    static int i=0;


    public void addBook(Book book){
        if(i<books.length ){
            books[i]=book;
            i++;
        }}


    public void listBook(){
        for(int j=0;j< books.length;j++){
            System.out.println(books[j].toString());
        }
    }

    public void searchBook(BookCategory category){
        boolean found=false;
        for (Book book : books){
            if( book.category==category){
                System.out.println(book);
                found=true;
            }

        }
        if(!found){
            System.out.println("there is no such category in bookstore");
        }

    }
}
