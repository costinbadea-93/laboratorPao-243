package repository;

import model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository {

    private static List<Book> books = new ArrayList<Book>();

    private BookRepository(){
        populateDefaultBooks();
    }

    private static class SINGLETON_HOLDER{
        private static final BookRepository INSTANCE = new BookRepository();
    }

    public static BookRepository getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }

    private void populateDefaultBooks(){
        books.addAll(Arrays.asList(
                new Book("Book 1", "Author 1"),
                new Book("Book 2", "Author 2"),
                new Book("Book 3", "Author 3")
        ));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void deleteBookByName(final String bookName){
        books = books.stream()
                .filter(b -> !b.getName().equals(bookName))
                .collect(Collectors.toList());
    }
}
