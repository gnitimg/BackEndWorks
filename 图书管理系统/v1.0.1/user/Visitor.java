package user;

import Operate;
import Book;

import java.util.ArrayList;

public class Visitor extends User {
    public Visitor(String username) {
        super(username);
    }

    public void borrowBook(ArrayList<Book> list, String bookname) {
        new Operate().borrowBook(list, bookname);
    }

    public void returnBook(ArrayList<Book> list, String bookname) {
        new Operate().returnBook(list, bookname);
    }
}