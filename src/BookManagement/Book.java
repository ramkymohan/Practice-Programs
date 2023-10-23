package BookManagement;

public class Book {
    private String bookId;
    private  String title;
    private String author;
    private String category;
    private Float price;

    public Book(String bookId, String title, String author, String category, Float price) throws InvalidBookException {
//        if (!category.equals("Science") && !category.equals("Fiction") && !category.equals("Technology") && !category.equals("Others")){
//            throw new BookManagement.InvalidBookException("Category type is invalid.");
//        }
        if(price<0){
            throw new InvalidBookException("Price cannot be negitive");
        }
        if(!bookId.startsWith("B") && bookId.length()!=4){
            throw new InvalidBookException("book type is invalid.");
        }
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
}
