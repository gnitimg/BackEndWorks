package user;

import operate.BorrowBook;
import operate.ReturnBook;
import book.Book;

import java.util.ArrayList;

public class Visitor extends User {
    public Visitor(String username) {
        super(username);
    }

    public void borrowBook(ArrayList<Book> list, String bookname) {
        new BorrowBook().borrowBook(list, bookname);
    }

    public void returnBook(ArrayList<Book> list, String bookname) {
        new ReturnBook().returnBook(list, bookname);
    }
}