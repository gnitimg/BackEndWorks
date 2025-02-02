import operate.*;
import book.Book;
import user.Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------图书管理系统--------");
        String username, password, usertype = "null";
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("请登录……");
            while (!usertype.equals("visitor") && !usertype.equals("admin")) {
                System.out.println("请输入用户名");
                username = sc.nextLine();
                System.out.println("请输入密码");
                password = sc.nextLine();
                Login l = new Login();
                if (l.logg(username, password) == 1) {
                    usertype = "admin";
                    System.out.println("管理员登录成功");
                } else if (l.logg(username, password) == 2) {
                    usertype = "visitor";
                    System.out.println("读者登录成功");
                } else {
                    System.out.println("用户名或密码错误！！！");
                }
            }

            while (true) {
                if (usertype.equals("visitor")) {
                    System.out.println("请选择操作代码");
                    System.out.println("0、退出登录");
                    System.out.println("1、借书");
                    System.out.println("2、还书");
                    System.out.println("3、查书");
                    int operate = sc.nextInt();
                    sc.nextLine();

                    if (operate == 1) {
                        System.out.println("请输入需要借的书名");
                        new BorrowBook().borrowBook(list, sc.nextLine());
                    } else if (operate == 2) {
                        System.out.println("请输入需要还的书名");
                        new ReturnBook().returnBook(list, sc.nextLine());
                    } else if (operate == 3) {
                        System.out.println("请输入图书名");
                        new CheckBook().checkBook(list, sc.nextLine());
                    } else if (operate == 0) {
                        usertype = "null";
                        System.out.println("已退出登录，返回登录界面");
                        break;
                    }
                } else if (usertype.equals("admin")) {
                    System.out.println("请选择操作代码");
                    System.out.println("0、退出登录");
                    System.out.println("1、添加图书");
                    System.out.println("2、删除图书");
                    System.out.println("3、查找图书");
                    int operate = sc.nextInt();
                    sc.nextLine();

                    if (operate == 1) {
                        System.out.println("请输入图书名");
                        String name = sc.nextLine();
                        System.out.println("请输入图书ISBN号");
                        String ISBN = sc.nextLine();
                        new AddBook().addBook(list, name, ISBN);
                    } else if (operate == 2) {
                        System.out.println("请输入需要删除图书的ISBN");
                        new DeleteBook().deleteBook(list, sc.nextLine());
                    } else if (operate == 3) {
                        System.out.println("请输入图书名");
                        new CheckBook().checkBook(list, sc.nextLine());
                    } else if (operate == 0) {
                        usertype = "null";
                        System.out.println("已退出登录，返回登录界面");
                        break;
                    }
                }
            }
        }
    }
}