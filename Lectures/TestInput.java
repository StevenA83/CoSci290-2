/*  
  Christian Castillo
  CS290
  13 Feb 2018
  
  Testing data types and input from user
*/
import java.util.Scanner; //is a java objesct that allows the take user input
public class TestInput{
  
  //main method - starting point of application
  public static void main(String[] args){
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _ (underscore), or $ (dollarsign)
    //2. Identifiers with pultiple names are camelCased
    //e.g. - numOfStudents, name, interestRate
    
    //datatypes
    //int - integer - whole number => 3, 2147483647, -12
    //double - decimal number => 3.33,     
    //char - character inside single quote => 'x', '3', ' '
    //boolean - true or false
    
    //object/reference datatypes
    //String - characters surrounded by double quotes
    /* There are other objects in Java: Scanner, System, 
    
    */
      String name = "Chris";
      int age = 0;
        
      System.out.println("Hi " + name);
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name");
    
    name = input.next();
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt();
    
    System.out.println("You are " + age + " years old.");
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR " + hours + " hours old!");
    
  }
}