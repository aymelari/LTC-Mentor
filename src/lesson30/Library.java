package lesson30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    Map<String,Book> map=new HashMap<>();

    public void addBook(Book book){

        String isbn= book.ISBN;
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter book name");
        String name=scan.nextLine();
        System.out.println("enter the author");
        String author =scan.nextLine();
        System.out.println("enter the ISBN");
        String isbn=scan.nextLine();
        System.out.println("enter the availibilty  AVAILABLE(a) or  CHECKED_OUT(b)");
        String answer=scan.nextLine();
        availabilityStatus a;
        if(answer.equals("a")){
             a=availabilityStatus.AVAILABLE;
        }else{ a=availabilityStatus.CHECKED_OUT;
        }
        Book book=new Book(name,author,isbn,a); */
        map.put(isbn,book);


    }

    public void checkOutBook(Book book){
        boolean found=false;
      for(Map.Entry<String,Book> entry : map.entrySet()){
          if(book.equals(entry.getValue())&& book.a.equals(availabilityStatus.CHECKED_OUT)){
              throw new BookAlreadyCheckedOutException("book already checked out");
          }
          else if(book.equals(entry.getValue())){
              found=true;
              System.out.println(" book is available");
          }
      } if(found==false){
          throw new BookNotFoundException("book has not found");
        }
    }


    public void returnBook(Book book){
        for(Map.Entry<String,Book> entry : map.entrySet()){
            if(book.equals(entry.getValue())&& book.a.equals(availabilityStatus.CHECKED_OUT)){
                book.a= availabilityStatus.AVAILABLE;
            }
        }
    }

}
