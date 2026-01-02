
import java.util.Scanner;
public class While {
  public static void main(String[] args) {
      
    /* icu 
    * initilization
    * comparison or condition 
    * update
    */
    
    System.out.println("Guesss the password!");
    String password = "let me in fuckers";  // condition
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine(); //condition 

    // using while loop
    while(!guess.equals(password))  // initilazing 
    {
      System.out.println("Guess the password! ");
      guess = scanner.nextLine();  // updating the value
    }
    System.out.println("Congrats ");
    
    //close the scanner class
    scanner.close(); 
  }
}

// Do while executes the code atleast once 
/*
  String password = "let me in fuckers ";
  Scanner scanner = new Scanner(System.in);
  String guess;  --> defining outside bcoz if we define inside braceses it would only be for braceses
  do
  {
    System.out.println("Guess the password:");
    guess = scanner.nextLine();
  } while( !guess.equals(password));

  System.out.println("Cngrats");
  scanner.close();


  NOTE :: if you to define something define outside the while section not inside the braceses
*/
