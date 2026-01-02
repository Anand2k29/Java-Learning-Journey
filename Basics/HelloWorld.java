import java.util.Scanner;

public class HelloWorld { // creating class -- file name must be same as class name 
    public static void main(String[] args) {  //  Method
        System.out.println("What is your name ?"); // Syntax for output

        //type identifier = new type();
        Scanner scanner = new Scanner(System.in); // For taking input 
        String name = scanner.nextLine();  

        System.out.println("hello "  +  name);
     }
     
}   

// Class -  Contains everything - has members 
// Methods - do something 
// Properties - Instance of a class 
// Access Modifiiers -  who can use
//static - no instance of class is needed
// object -  instance of a class 

//arguments - what you pass to a method ( part of the calling )
//Parameters -- variables to store arguments ( part of defination ) 

/* NOTE { diff b/w x++ & ++x}

    int x = 5;
    int a = x++; --->> x = 6 &  a = 5
    first x values is shofted to a & then x is updated 

    int a = ++x;  -->> x = 6 & a = 6
    in this both are updated 
 */


