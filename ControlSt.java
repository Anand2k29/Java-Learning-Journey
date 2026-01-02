import java.util.Scanner;

public class ControlSt {
  public static void main(String[] args) {
      String password = "let me in";
      System.out.println("Guess the password: ");

      Scanner scanner = new Scanner(System.in); // for input 
      String guess = scanner.nextLine();

      System.out.println(password.equals(guess));

      //equals --> return True or False
      if(password.equals(guess)){
        //code to execute(if true)
        System.out.println("Your guess was correct!");
      } else{
        System.out.println("This is not always going to run!");
      }
    scanner.close();  // to close the scanner class 
  }
  
}
