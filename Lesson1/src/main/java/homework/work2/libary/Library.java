package homework.work2.libary;

import homework.work2.CustomList;

import java.util.ArrayList;

public class Library {


    private final ArrayList libraryBooks = new ArrayList();

    public boolean addBook(Book book) {
        if (!libraryBooks.contains(book)) {
            libraryBooks.add(book);
            return true;
        } else {
            return false;
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
    public ArrayList findBooksByAuthor(Author author) {
        ArrayList books = new ArrayList();
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book =  (Book)  libraryBooks.get(i);
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }
        return books;
    }


}
