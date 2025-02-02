package user;

import operate.CheckBook;
import book.Book;

import java.util.ArrayList;

public class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void checkBook(ArrayList<Book> list, String bookname) {
        new CheckBook().checkBook(list, bookname);
    }
}
