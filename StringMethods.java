import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {
      
    String fullAd = " String has many MEthods";

    //to make every word Upper case 
    System.out.println(fullAd.toUpperCase());

    // To lower case
    System.out.println(fullAd.toLowerCase());

    //To remove extra spaces at beginning or at the end
    // includes spaces , tabs(\t) & newline (\n)
    // maily used for passwords 
    System.out.println(fullAd.strip());

    // only removes spaces at the beginning
    System.out.println(fullAd.stripLeading());

    // only removes spaces at the end
    System.out.println(fullAd.stripTrailing());

    // Simple code to guess the password
    String password = " kaise ho"; // this is the value of string 
    System.out.println("Guess the password : ");
    Scanner scanner = new Scanner(System.in); // to take input 
    String guess = scanner.nextLine();
    // equals --> returns true or false depending on the value of string
    System.out.println(password.equals(guess)); // to print output 
    scanner.close();  // Closing the Scanner class

  }

 
  
}
