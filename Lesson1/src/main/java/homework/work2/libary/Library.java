package homework.work2.libary;

import java.util.ArrayList;

public class Library {


    private final ArrayList<Book> libraryBooks = new ArrayList<>();

    public void addBook(Book book) {
        if (!libraryBooks.contains(book)) {
            libraryBooks.add(book);
        }
    }


    public Book findBook(String title, Author author) {

        Book findBooks = new Book(title, author, null);

        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = (Book) libraryBooks.get(i);
            if (book.equals(findBooks)) {
                return book;
            }
        }
        return null;
    }

    // Находит все книги указанного автора
    public ArrayList<Book> findBooksByAuthor(Author author) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book libraryBook : libraryBooks) {
            if (((Book) libraryBook).getAuthor().equals(author)) {
                books.add((Book) libraryBook);
            }
        }
        return books;
    }


}
