package operate;

import book.Book;

import java.util.ArrayList;

public class Operate {
    public void addBook(ArrayList<Book> list, String bookname, String ISBN) {
        Book book = new Book();
        book.setBookname(bookname);
        book.setISBN(ISBN);
        book.setState(1); //未出借
        list.add(book);
        System.out.println("《" + bookname + "》已成功添加");
    }

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

    public void deleteBook(ArrayList<Book> list, String ISBN) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getISBN().equals(ISBN)) {
                list.remove(i);
                System.out.println("图书已删除");
                return;
            }
        }
        System.out.println("该图书不存在");
    }

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
