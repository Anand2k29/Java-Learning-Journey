import java.util.Scanner;

// --- Base Class ---
class Employee {
    String name;
    double baseSalary;

    // A method to show details
    void showSalary() {
        System.out.println("Employee: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }
}

// --- Child Class ---
// Manager IS AN Employee, but with extra features (Bonus)
class Manager extends Employee {
    double bonus;

    // Overriding: Adding custom logic to calculate total
    void calculateTotal() {
        double total = baseSalary + bonus;
        System.out.println("Total Salary (Base + Bonus): $" + total);
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // We create a Manager object because it has access to BOTH 
        // Employee fields (name, salary) AND Manager fields (bonus).
        Manager mgr = new Manager();

        System.out.println("--- Enter Manager Details ---");
        
        System.out.print("Enter Name: ");
        mgr.name = sc.nextLine(); // 'name' comes from Employee class

        System.out.print("Enter Base Salary: ");
        mgr.baseSalary = sc.nextDouble(); // 'baseSalary' comes from Employee class

        System.out.print("Enter Bonus Amount: ");
        mgr.bonus = sc.nextDouble(); // 'bonus' belongs to Manager class

        System.out.println("\n--- Salary Slip ---");
        mgr.showSalary();     // Reusing the Parent's method
        mgr.calculateTotal(); // Using the Child's method
    }
}

/*
[ Employee Class ]      <--- Parent
|  - name              
|  - baseSalary        
|__________________
        ^
        | (extends)
        |
[ Manager Class ]       <--- Child
|  - bonus             (Adds new variable)
|  - calculateTotal()  (Adds new method)
|__________________
*/