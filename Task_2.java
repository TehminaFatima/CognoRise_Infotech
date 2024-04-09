package tasks;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String status;

    public Book(String t, String a, String s) {
        this.title = t;
        this.author = a;
        this.status = s;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
    }
}

class LibraryCatalog {

    private ArrayList<Book> books;

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        books.add(inputBook);
        System.out.println("Book added successfully");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBookDetails();
                System.out.println("--------------------");
            }
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Status: " + book.getStatus());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book found:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Status: " + book.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void returnBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equalsIgnoreCase("checked out")) {
                    book.setStatus("available");
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book is already available!");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void checkOut(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equalsIgnoreCase("available")) {
                    book.setStatus("checked out");
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book is already checked out!");
                }
                found = true;
                break;
            }
        }if (!found) {
            System.out.println("Book not found!");
        }
    }
}

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryCatalog library = new LibraryCatalog();

     // Add books to the library
     library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "available"));
     library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "available"));
     library.addBook(new Book("Pride and Prejudice", "Jane Austen", "available"));
     while(true) {
        System.out.println("1. Add a book");
        System.out.println("2. Search by title");
        System.out.println("3. Search by author");
        System.out.println("4. Check out a book");
        System.out.println("5. Return a book");
        System.out.println("6. Display all books");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the title of the book: ");
                String title = sc.nextLine();
                System.out.print("Enter the author of the book: ");
                String author = sc.nextLine();
                Book newBook = new Book(title, author, "available");
                library.addBook(newBook);
                break;
            case 2:
                System.out.print("Enter the title of the book to search: ");
                title = sc.nextLine();
                library.searchByTitle(title);
                break;
            case 3:
                System.out.print("Enter the author of the book to search: ");
                author = sc.nextLine();
                library.searchByAuthor(author);
                break;
            case 4:
                System.out.print("Enter the title of the book to check out: ");
                title = sc.nextLine();
                library.checkOut(title);
                break;
            case 5:
                System.out.print("Enter the title of the book to return: ");
                title = sc.nextLine();
                library.returnBook(title);
                break;
            case 6:
                library.displayAllBooks();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        
        System.out.println("do you want to continue");
        String c=sc.next();
        if(c.equalsIgnoreCase("no")) {
        	System.out.println("GOOD BYE (^~^)");
        	break;
        }else {
        	System.out.println("WELCOME!");
        }
    }sc.close();
    
    System.out.println("THANK YOU *~* ");
}}