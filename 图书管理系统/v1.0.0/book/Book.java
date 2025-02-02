package book;

public class Book {
    private String bookname;
    private String ISBN;
    private int state; // 1: 在库, 0: 借出

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}