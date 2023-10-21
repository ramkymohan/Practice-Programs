import java.util.Scanner;
public class BookUtil {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1.Add Book");
            System.out.println("2.Search By Title");
            System.out.println("3.Search By Author");
            System.out.println("4.Display All Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    try {
                        System.out.println("Enter Book Id: ");
                        String bookId = scanner.nextLine();
                        System.out.println("Enter Title: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter Category: ");
                        String category = scanner.nextLine();
                        System.out.println("Enter Author: ");
                        String  author = scanner.nextLine();
                        System.out.println("Enter Price: ");
                        Float  price = scanner.nextFloat();

                        Book book = new Book(bookId,title,category,author,price);
                        bookStore.addBook(book);
                        System.out.println("Book is successfully added ");
                    }catch (InvalidBookException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter title which u want to search");
                    String title = scanner.nextLine();
                    bookStore.searchByTitle(title);
                    break;
                case 3:
                    System.out.println("Enter the author which u want to search");
                    String author = scanner.nextLine();
                    bookStore.SearchByAuthor(author);
                    break;
                case 4:
                    System.out.println("Displaying all the books");
                    bookStore.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid option.");

            }
        }
    }
}
