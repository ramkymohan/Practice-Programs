package BookManagement;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> book1 = new ArrayList<>();
    public  void addBook(Book b) throws InvalidBookException {
        for(Book book:book1){
            if(book.getBookId().equalsIgnoreCase(b.getBookId())){
                throw new InvalidBookException("BookManagement.Book id must be unique");
            }
        }
        book1.add(b);

    }
    public void searchByTitle(String title){
        for(Book book :book1){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("book is found");
                printBook(book);
                return;
            }
        }
        System.out.println("Title is not found in book collection");
    }
    public void SearchByAuthor(String author){
        for(Book book:book1){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("BookManagement.Book is found");
                printBook(book);
                return;
            }
        }
        System.out.println("author is not found in the book collection");
    }

    public void displayAllBooks(){
        for(Book book:book1){
            printBook(book);
        }

    }
    public void printBook(Book book){
        System.out.println("BookId: "+book.getBookId());
        System.out.println("Title: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Category: "+book.getCategory());
        System.out.println("Price: "+book.getPrice());
    }
}
