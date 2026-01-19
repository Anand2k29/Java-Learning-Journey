/*
 * ==============================================================================
 * PROGRAM: LIBRARY MANAGEMENT USING INTERFACE
 * ==============================================================================
 * Concepts:
 * - Interface 'LibraryOps' defines the rules (abstract methods).
 * - Class 'LibraryBook' implements the interface and stores data members.
 * - Fine Logic: If days late > 0, Fine = days * 5 rupees.
 * ==============================================================================
 */

import java.util.Scanner;

// Interface declaration
interface LibraryOps {
    void calculateReturnDate();
    void calculateFine();
    void displayDetails();
}

class LibraryBook implements LibraryOps {
    String book_name, book_title, acctype;
    int daysKept;
    double balance = 0; // Represents fine balance

    // Constructor to set basic details
    LibraryBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        book_name = sc.nextLine();
        System.out.print("Enter Book Title: ");
        book_title = sc.nextLine();
        System.out.print("Enter Account Type (Student/Staff): ");
        acctype = sc.nextLine();
        System.out.print("Enter number of days book was kept: ");
        daysKept = sc.nextInt();
    }

    @Override
    public void calculateReturnDate() {
        // Simple logic: Standard return time is 15 days
        System.out.println("Standard Return Period: 15 Days");
    }

    @Override
    public void calculateFine() {
        int allowedDays = 15;
        if (daysKept > allowedDays) {
            int extraDays = daysKept - allowedDays;
            balance = extraDays * 5.0; // Assume 5.0 currency units fine per day
            System.out.println("Book is late by " + extraDays + " days.");
        } else {
            balance = 0;
            System.out.println("Returned on time. No Fine.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Library Receipt ---");
        System.out.println("Book: " + book_name + " (" + book_title + ")");
        System.out.println("User Type: " + acctype);
        System.out.println("Days Kept: " + daysKept);
        System.out.println("Fine Amount: " + balance);
        System.out.println("-----------------------");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.calculateReturnDate();
        book.calculateFine();
        book.displayDetails();
    }
}