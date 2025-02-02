package user;

import operate.AddBook;
import operate.DeleteBook;
import book.Book;
import java.util.ArrayList;

public class Admin extends User {
    public Admin(String username) {
        super(username);
    }
    public void addBook(ArrayList<Book> list, String bookname, String ISBN) {
        new AddBook().addBook(list, bookname, ISBN);
    }
    public void deleteBook(ArrayList<Book> list, String ISBN) {
        new DeleteBook().deleteBook(list, ISBN);
    }
}