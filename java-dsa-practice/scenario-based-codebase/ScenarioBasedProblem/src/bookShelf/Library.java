package bookShelf;

import java.util.HashMap;
import java.util.LinkedList;

class Library {

    private HashMap<String, LinkedList<Book>> library;

    // Constructor: add some initial books
    Library() {
        library = new HashMap<>();

        addInitialBook("Fiction", new Book("The Alchemist", "Paulo Coelho"));
        addInitialBook("Fiction", new Book("1984", "George Orwell"));
        addInitialBook("Science", new Book("Brief History of Time", "Stephen Hawking"));
    }

    private void addInitialBook(String genre, Book book) {
        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(book);
    }

    // Return book
    void returnBook(String genre, Book book) {
        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(book);
        System.out.println(" Book returned: " + book);
    }

    // Borrow book
    void borrowBook(String genre, String bookName) {
        if (!library.containsKey(genre)) {
            System.out.println(" Genre not found!");
            return;
        }

        for (Book b : library.get(genre)) {
            if (b.name.equalsIgnoreCase(bookName)) {
                library.get(genre).remove(b);
                System.out.println(" Book borrowed: " + b);
                return;
            }
        }
        System.out.println(" Book not available!");
    }

    // Display library
    void displayLibrary() {
        System.out.println("\n Library Catalog:");
        for (String genre : library.keySet()) {
            System.out.println(genre + " → " + library.get(genre));
        }
    }
}
