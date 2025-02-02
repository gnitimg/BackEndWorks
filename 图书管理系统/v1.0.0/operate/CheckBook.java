package operate;

import book.Book;

import java.util.ArrayList;

public class CheckBook {
    public void checkBook(ArrayList<Book> list, String bookname) {
        for (Book b : list) {
            if (b.getBookname().equals(bookname)) {
                int state = b.getState();
                if (state == 1) {
                    System.out.println("《" + bookname + "》图书在库");
                } else if (state == 0) {
                    System.out.println("《" + bookname + "》图书已借出");
                }
                return;
            }
        }
        System.out.println("图书不存在");
    }
}