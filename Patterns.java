// 9 PATTERNS 

import java.util.Scanner;
public class Patterns {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); // defined a scanner to be used mutliple times

    System.out.print("Enter the no of rows :"); 
    int m = scanner.nextInt();  // to take the input 

    System.out.print("Enter the no. of columns: ");
    int n = scanner.nextInt(); // ti take the input
/* */
    System.out.println(" ");
    System.out.println("-----------------");
    System.out.println(" Solid Rectangle  ");
    System.out.println("-----------------");
   
    // 1. FOR SOLID RECTANGLE 
    for(int i=1; i<=n; i++){  // outer loop --> for columns
      for(int j=1;j<=m;j++){  // inner loop --> for rows
        System.out.print("*"); // avoid using println here
      }
      System.out.println();
    }


    System.out.println("-----------------"); // to keep some space in b/w two outputs
    System.out.println(" Hollow Rectangle ");
    System.out.println("-----------------");


  //2.  FOR HOLLOW RECTANGLE 
    for(int i=1; i<=n; i++){  // outer loop  --> for columns 
      for(int j=1;j<=m; j++){ // inner loop  --> for rows
        //cell -> (i,j)
        if( i == 1 || j == 1 || i == n || j == m){  // it uses method of matrices .. if any of the condition is true it will print the following output
          System.out.print("&");                  // to check the above st ... just write down the output on the paper and name the rows & columns of each "& ".. u will get to know the conditon
        }else{
          System.out.print(" "); // if we dont write this part .. we will not get the hollow space in between
        }
      }
      System.out.println();
    }

    System.out.println("-----------------");
    System.out.println(" Half Pyramid ");
    System.out.println("-----------------");
    // FOR HALF PYRAMID ( left to right )
    // here u don't need to use any m ... bcoz it is totally depending upon the row number 
    // row number = no. of columns 
    for( int i=1; i<=n; i++){
      for(int j=1; j<=i;j++){
        System.out.print(" $ ");
      }
      System.out.println();
    }

    System.out.println("-----------------");
    System.out.println(" Inverted Pyramid ");
    System.out.println("-----------------");

    for(int i=n; i>=1; i--){
      for(int j=1; j<=i;j++){
        System.out.print(" ! ");
      }
      System.out.println();
    }

    System.out.println("----------------------------------");
    System.out.println(" Inverted Right to left Pyramid ");
    System.out.println("----------------------------------");

    // to print this 
    /* 3 spaces + 1 * --> 4   |
       2 spaces + 2* ==> 4    |-----\  no. of rows(n)
       1 space + 3*  --> 4    |-----/
       0 spaces + 4* --> 4    |
   */

    for(int i =1; i<=n; i++){
      //inner loop -> to print space
      for( int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      // inner loop --> to print Star
      for( int j=1 ; j<=i; j++){
        System.out.print(" * ");
      }
      System.out.println();
    } 
    
    System.out.println("---------------------------");
    System.out.println(" Half pyramid with Numbers");
    System.out.println("---------------------------");

    for( int i=1; i<=n; i++){       // for 1st row 1 is printed 
      for (int j=1; j<=i; j++){    // similarly for 2nd row (1,2)... & so on for nth row (1,...,n)
        System.out.print(j + " "); // print j 
      }
      System.out.println();
    }

    System.out.println("----------------------------------");
    System.out.println("Inverted  Half pyramid with Numbers");
    System.out.println("-----------------------------------");

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i+1; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("----------------------------------");
    System.out.println( "Floyd's Triangle");
    System.out.println("-----------------------------------");

    // row number = no.of values ( but contionous values )
    int number = 1;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(number + " ");
        number++; // number = number + 1
      }
      System.out.println();
    }

    System.out.println("----------------------------------");
    System.out.println(         " 0-1 Triangle             ");
    System.out.println("-----------------------------------");

    // phele 0-1 likho paper pe alternate way mein in matrix form 
    // then write their matrix value of i & j 
    // add i + j
    // you will observe that 
    // i+j == odd --> 0
    // i+j == Even --> 1

    //OUTER loop
    for( int i =1; i<=n; i++){
      //inner loop
      for(int j=1; j<=i; j++){
        int sum = i+j;
        if( sum % 2 == 0 ){ // to check if its even 
          System.out.print(" 1 ");
        }else {
          System.out.print(" 0 ");
        }
      }
      System.out.println();
    }
    
    scanner.close();
  }  
  
}
