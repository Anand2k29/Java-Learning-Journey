/**
 * TOPIC: Java Interfaces (Basics)
 * --------------------------------
 * WHAT IS AN INTERFACE?
 * An Interface is a completely "abstract" class. It acts like a contract or a rule book.
 * - It defines *what* a class must do, but not *how* to do it.
 * - All methods in an interface are implicitly 'public' and 'abstract' (empty).
 * * SYNTAX:
 * - Use the keyword 'interface' to define it.
 * - Use the keyword 'implements' to use it in a class.
 * * WHY USE IT?
 * 1. To achieve total abstraction (hiding details).
 * 2. To support Multiple Inheritance (a class can implement multiple interfaces).
 */

// 1. THE INTERFACE (The Rule Book)
interface Vehicle {
    
    // Abstract method: It has no body {}. 
    // Any class that implements 'Vehicle' MUST provide code for this method.
    void startEngine();
    
    // Another abstract method
    void stopEngine();
}

// 2. IMPLEMENTATION CLASS #1 (Car)
// The 'Car' class signs the contract to be a 'Vehicle'.
class Car implements Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Car: Key turned. Engine is purring.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Engine stopped safely.");
    }
}

// 3. IMPLEMENTATION CLASS #2 (Bike)
// The 'Bike' class also signs the contract but behaves differently.
class Bike implements Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Bike: Kick start! Engine roaring.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike: Engine cut off.");
    }
}

// 4. MAIN CLASS (To run the code)
public class InterfaceBasics {
    public static void main(String[] args) {
        System.out.println("--- Interface Basics Demo ---\n");

        // Example A: Creating a Car object
        // We can use the Interface name (Vehicle) as the reference type
        Vehicle myCar = new Car(); 
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println(); // Space for readability

        // Example B: Creating a Bike object
        Vehicle myBike = new Bike();
        myBike.startEngine();
        myBike.stopEngine();

        /*
         * SUMMARY:
         * Notice how 'myCar' and 'myBike' are both type 'Vehicle'.
         * This is Polymorphism. We can treat different objects the same way
         * because they both follow the same rules (Interface).
         */
    }
}