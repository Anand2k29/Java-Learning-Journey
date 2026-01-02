import java.util.Scanner;

public class Logical {
  
  public static void main(String[] args) {
      System.out.println("How old are you?");

      Scanner scanner = new Scanner(System.in);
      scanner.close(); // closing scanner class
      int age =  Integer.parseInt(scanner.nextLine());

      System.out.println("Cats or Dogs?");
      String animal = scanner.nextLine(); 

      /* COMPARISON OPERATOS ( return true or false)
        * == equaltiy operator
        * != innequality operator 
        * <  less than
        * >  greator thanṇ
        * <= less than equal to
       */

      /*  LOGICAL OPERATORS 
       * && --> AND operator (returns true only of both st's are correct)
       * || --> OR operator ( returns true if one st is correct..or both) 
       * ?  --> NOT operator (inverses the boolean)
      */

      if(age > 12 && animal.equals("Dogs")) // Comparison operator 
      {          // && --> AND operator
        System.out.println("Welcome!");
      }
  }
  
}
