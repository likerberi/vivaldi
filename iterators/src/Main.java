import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf books = new BookShelf(4);
//        BookShelf bookshelf = new ArrayList<Book>(5);
//        new Book("1");
//        new Book("2");
//        new Book("3");
//        new Book("4");
//        new Book("5");
        books.appendBook(new Book("1"));
        books.appendBook(new Book("1"));
        books.appendBook(new Book("1"));
        books.appendBook(new Book("1"));
        books.appendBook(new Book("1"));
        System.out.println();
    }
}

