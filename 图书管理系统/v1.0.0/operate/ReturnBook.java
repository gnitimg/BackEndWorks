package operate;

import book.Book;

import java.util.ArrayList;

public class ReturnBook {
    public void returnBook(ArrayList<Book> list, String bookname) {
        for (Book b : list) {
            if (b.getBookname().equals(bookname)) {
                if (b.getState() == 0) {
                    b.setState(1);
                    System.out.println("成功还书！！！");
                } else {
                    System.out.println("该书未借出");
                }
                return;
            }
        }
        System.out.println("该图书不存在");
    }
}