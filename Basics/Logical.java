import java.util.Scanner;

public class Logical {
  
  public static void main(String[] args) {
      System.out.print("How old are you? : " );

      Scanner scanner = new Scanner(System.in);
      
      int age =  Integer.parseInt(scanner.nextLine());  /*  ParseInt : It takes a String (text) .
                                                          and forces it to become an int (a whole number)*/
      System.out.print("Cats or Dogs?  =  " );
      String animal = scanner.nextLine(); 

      /* COMPARISON OPERATOS ( return true or false)
        * == equaltiy operator
        * != innequality operator 
        * <  less than
        * >  greator than
        * <= less than equal to
       */

      /*  LOGICAL OPERATORS 
       * && --> AND operator (returns true only of both st's are correct)
       * || --> OR operator ( returns true if one st is correct..or both) 
       * ?  --> NOT operator (inverses the boolean)
      */

      // 1. Check strict condition for Dogs
            // 1. First Check: Specific Case for Dogs over 12
      if (age > 12 && animal.equalsIgnoreCase("Dogs")) {
          System.out.println("Welcome!");

      // 2. Middle Check: Is the input INVALID? (Neither Dogs NOR Cats)
      // If I type "Cats", this line becomes FALSE, so we skip it.
      } else if (!animal.equalsIgnoreCase("Dogs") && !animal.equalsIgnoreCase("Cats")) {
          System.out.println("Choose Between Dogs & Cats");

      // 3. Final bucket: Everything else
      // This catches "Cats" (because it skipped the error check above)
      // This also catches "Dogs" if they are age 12 or younger.
      } else {
          System.out.println("Love Dogs");
      }
  }
  
}
