import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookLibrary;
    
    public Library () {
        this.bookLibrary = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.bookLibrary.add(newBook);
    }
    
    public void printBooks() {
        for(Book book: bookLibrary) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: bookLibrary) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : bookLibrary) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
       ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : bookLibrary) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found; 
    }
}
