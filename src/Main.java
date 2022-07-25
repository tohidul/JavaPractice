import com.tohidul.OopPractice.Author;
import com.tohidul.OopPractice.Book;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Bazlur", "bazlur@gmail.com","Male");
        Book book = new Book("java programming", author, 413, 1000);

        System.out.println("Name of the book: " + book.getName());
        System.out.println("Name of the author: " + book.getAuthor());
        System.out.println("Price of the book: " + book.getPrice());
        System.out.println("Available in stocks: " + book.getNumber_of_unit());


    }
}