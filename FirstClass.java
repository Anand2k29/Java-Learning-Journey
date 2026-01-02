// Creating a class
class User{  
  // members - methods & properties 
public String firstName; 
public String lastName;

  public String getFullName(){
    return firstName +" "+ lastName;

  }
}


//Main class
public class FirstClass{      
  public static void main(String[] args) {

    //Creating a class Object ( user)
      User user = new User();   
      user.firstName = "Anand Minejes";
      user.lastName = " sexy ";

      //For Output 
      System.out.println(user.getFullName()); //getFullName is a method (a function),
  }                                           //you must add parentheses () at the end.
}

