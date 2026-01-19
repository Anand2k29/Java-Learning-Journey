/*
 * ======================================================================================
 * PROGRAM SUMMARY: OBJECT INITIALIZATION IN JAVA
 * ======================================================================================
 * This program demonstrates the three standard ways to initialize an object (store data):
 * * 1. By Reference Variable:
 * - Direct access using the dot operator (e.g., obj.name = "John").
 * - Simple, but exposes data directly (less secure).
 * * 2. By Method:
 * - Using a function to assign values (e.g., obj.insert(10, "John")).
 * - Better encapsulation; allows logic checking before assignment.
 * * 3. By Constructor:
 * - Passing values when creating the object (e.g., new Student(10, "John")).
 * - The most common and preferred way; ensures object is ready upon creation.
 * ======================================================================================
 */

class Student {
    int id;
    String name;

    // WAY 2: Method to initialize object
    void insertRecord(int r, String n) {
        id = r;
        name = n;
    }

    // WAY 3: Constructor to initialize object
    Student(int r, String n) {
        id = r;
        name = n;
    }
    
    // Default constructor (Required for Way 1 to work)
    // If we define any constructor (like above), Java doesn't provide a default one,
    // so we must manually add this empty one to allow "new Student()"
    Student(){} 

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ObjectInitDemo {
    public static void main(String[] args) {
        
        // ---------------------------------------------------------
        // METHOD 1: Initialization by Reference Variable
        // ---------------------------------------------------------
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Amit";
        System.out.print("1. By Reference Variable: ");
        s1.display();

        // ---------------------------------------------------------
        // METHOD 2: Initialization by Method
        // ---------------------------------------------------------
        Student s2 = new Student();
        s2.insertRecord(102, "Rahul");
        System.out.print("2. By Method:             ");
        s2.display();

        // ---------------------------------------------------------
        // METHOD 3: Initialization by Constructor
        // ---------------------------------------------------------
        Student s3 = new Student(103, "Priya");
        System.out.print("3. By Constructor:        ");
        s3.display();
    }
}