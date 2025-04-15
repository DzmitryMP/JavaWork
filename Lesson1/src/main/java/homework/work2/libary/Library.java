package homework.work2.libary;

import homework.work2.CustomList;

public class Library {


    private final CustomList libraryBooks = new CustomList();

    public boolean addBook(Book book) {
        if (!libraryBooks.find(book)) {
            libraryBooks.add(book);
            return true;
        } else {
            return false;
        }
    }


    public Book findBook(String title, Author author) {

        Book findBooks = new Book(title, author, null);

        for (int i = 0; i < libraryBooks.getSize(); i++) {
            Book book = (Book) libraryBooks.getObj(i);
            if (book.equals(findBooks)) {
                return book;
            }
        }
        return null;
    }

    // Находит все книги указанного автора
    public CustomList findBooksByAuthor(Author author) {
        CustomList books = new CustomList();
        for (int i = 0; i < libraryBooks.getSize(); i++) {
            Book book =  (Book)  libraryBooks.getObj(i);
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }
        return books;
    }


}
