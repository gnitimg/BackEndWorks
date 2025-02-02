package operate;
import book.Book;
import java.util.ArrayList;
public class DeleteBook {
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
}