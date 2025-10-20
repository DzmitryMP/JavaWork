package homework.work2.libary;

import java.util.*;

public class Library {

    private final Map<Author, Set<Book>> authorBooksMap = new HashMap<>();

    public void addBook(Book book) {
        authorBooksMap.computeIfAbsent(book.getAuthor(), k -> new HashSet<>()).add(book);
    }


    public Book findBook(String title, Author author) {
        Set<Book> authorsBooks = authorBooksMap.get(author);

        if (authorsBooks != null) {
            for (Book book : authorsBooks) {
                if (book.getName().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }


    // Находит все книги указанного автора
    public Set<Book> findBooksByAuthor(Author author) {
        return authorBooksMap.getOrDefault(author, Collections.emptySet());
    }

    public Author findAuthorByBookName(String title) {
        for (Map.Entry<Author, Set<Book>> entry : authorBooksMap.entrySet()) {
            for (Book book : entry.getValue()) {
                if (book.getName().equals(title)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }


}
