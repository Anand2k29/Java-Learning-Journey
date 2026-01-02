import java.util.Scanner;

public class Max{
  public static void main(String[] args) {
     
    //Create the Scanner once at the start
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number =  ");
    int x = scanner.nextInt();  // use " int " ( lowercase)

    System.out.print("Enter the second number = ");
    int y = scanner.nextInt(); // resue "Scanner " , don't redeclare it 

    // Print the result 
    System.out.print("Max number is:" + Integer.max(x, y));

    // Good practise: close the scanner 
    scanner.close();
     
  }
}
