class Student {
    int id;
    String name;

    // 1. No-Arg Constructor (Default)
    Student() {
        id = 0;
        name = "Unknown";
        System.out.println("Default Constructor called");
    }

    // 2. Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor called");
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();        // Calls No-Arg
        Student s2 = new Student(101, "Amit"); // Calls Parameterized
        s1.display();
        s2.display();
    }
}