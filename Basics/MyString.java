public class MyString {
  public static void main(String[] args) {
      
    String x = "Hello cats"; // x --> Object ( instance of a class)
    System.out.println(x + " & dogs"); // concatination -> combining two strings 
    x += " & pupppies"; // updating the value of x ... " Hello cats & puppies "
    System.out.println(x);

    String name = "Anand"; // while defining string use the keyword " String"
    System.out.println(name.length()); // To find the length
    
    System.out.println(x.charAt(6)); /*  goes to the specific index and finds
                                       what character it has and gives the output*/
                                            
  }
  
}
