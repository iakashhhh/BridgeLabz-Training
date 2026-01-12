package bookShelf;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter genre: ");
                    String genreB = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();
                    library.borrowBook(genreB, bookName);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String genreR = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String bookR = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    library.returnBook(genreR, new Book(bookR, author));
                    break;

                case 3:
                    library.displayLibrary();
                    break;

                case 4:
                    System.out.println(" Exiting Library System");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
