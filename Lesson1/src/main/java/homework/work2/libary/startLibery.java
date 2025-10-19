package homework.work2.libary;

import java.util.ArrayList;

import java.util.Date;

public class startLibery {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой", new Date(1828, 9, 9));
        Author dostoevsky = new Author("Фёдор", "Достоевский", new Date(1821, 11, 11));
        Author pushkin = new Author("Александр", "Пушкин", new Date(1799, 6, 6));

        Library library = new Library();

        library.addBook(new Book("Война и мир", tolstoy, "Текст Войны и мира..."));
        library.addBook(new Book("Анна Каренина", tolstoy, "Текст Анны Карениной..."));
        library.addBook(new Book("Преступление и наказание", dostoevsky, "Текст Преступления..."));
        library.addBook(new Book("Идиот", dostoevsky, "Текст Идиота..."));
        library.addBook(new Book("Евгений Онегин", pushkin, "Текст Онегина..."));
        library.addBook(new Book("Капитанская дочка", pushkin, "Текст Капитанской дочки..."));
        library.addBook(new Book("Война и мир", tolstoy, "Другой текст")); // Не добавится (дубликат)

        System.out.println("Поиск 'Война и мир' Толстого:");
        Book foundBook = library.findBook("Война и мир", tolstoy);
        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Не найдено");

        }
        System.out.println("Все книги Толстого:");
        ArrayList tolstoyBooks = library.findBooksByAuthor(tolstoy);
        for (int i = 0; i < tolstoyBooks.size(); i++) {
            System.out.println(tolstoyBooks.get(i));
        }
    }

}
