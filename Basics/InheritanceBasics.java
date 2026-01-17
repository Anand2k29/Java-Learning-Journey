// 1. The Parent Class (The Super Class)
// This class holds the common "DNA" that other classes can share.
class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat food.");
    }
}

// 2. The Child Class (The Sub Class)
// uses 'extends' to inherit everything from Animal.
class Dog extends Animal {
    
    // This method is specific to Dog only.
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class InheritanceBasics {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog();

        // access variable from Parent
        myDog.name = "Buddy"; 
        System.out.println("Name: " + myDog.name);

        // Call method from Parent
        myDog.eat(); 

        // Call method from Child (itself)
        myDog.bark();
    }
}
