package user;
import operate.Operate;
import book.Book;
import java.util.ArrayList;

public class Admin extends User {
    public Admin(String username) {
        super(username);
    }
    public void addBook(ArrayList<Book> list, String bookname, String ISBN) {
        new Operate().addBook(list, bookname, ISBN);
    }
    public void deleteBook(ArrayList<Book> list, String ISBN) {
        new Operate().deleteBook(list, ISBN);
    }
}