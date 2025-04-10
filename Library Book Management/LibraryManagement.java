import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public String getTitle() {
        return title;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Book[] books = new Book[5];
        books[0] = new Book("The Alchemist", "Paulo Coelho", 9.99);
        books[1] = new Book("1984", "George Orwell", 12.50);
        books[2] = new Book("To Kill a Mockingbird", "Harper Lee", 10.75);
        books[3] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 8.99);
        books[4] = new Book("Moby Dick", "Herman Melville", 11.30);
        
        System.out.print("Enter book title to search: ");
        String searchTitle = scanner.nextLine();
        
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                book.displayDetails();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Book not found in the library.");
        }
        
        scanner.close();
    }
}
