package operate;

import book.Book;

import java.util.ArrayList;

public class BorrowBook {
    public void borrowBook(ArrayList<Book> list, String bookname) {
        for (Book b : list) {
            if (b.getBookname().equals(bookname)) {
                if (b.getState() == 1) {
                    b.setState(0);
                    System.out.println("成功借书！！！");
                } else {
                    System.out.println("该书已被借出");
                }
                return;
            }
        }
        System.out.println("该图书不存在");
    }
}