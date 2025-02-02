package operate;

import book.Book;

import java.util.ArrayList;

public class AddBook {
    public void addBook(ArrayList<Book> list, String bookname, String ISBN) {
        Book book = new Book();
        book.setBookname(bookname);
        book.setISBN(ISBN);
        book.setState(1); //未出借
        list.add(book);
        System.out.println("《" + bookname + "》已成功添加");
    }
}