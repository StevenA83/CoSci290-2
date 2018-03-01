/*
  Christian Castillo
  Co Sci 290
  
  Demo on String class
*/
import java.util.Scanner;
public class TestString{

//main method
public static void main(String [] args){
    
  //instantiate the Scanner object
  Scanner input = new Scanner(System.in);
  
  String answer = " ";
  int nameLength = ;
  
  
  while(nameLength <2){
  
  System.out.println("What is your name?");
  
  
  
  if(answer.length() < 2){
    System.out.println("Please enter in a name that is at least\n"
                      + "two letters long!");
  }
    
    nameLength = answer.length();
  }
    
  
  
  //ask user a question
  System.out.println("Are you rich? Yes or No?");
  
  //get answer from console
  
  
  /*
    answer.toLowerCase()
    answer.toUpperCase()
    answer.equals("Some other String)
    answer.equalsIgnoreCase("no")
  */
  
  /*
  if(answer.equals("No")){
    System.out.println("That sucks!");
  }
  else{
    System.out.println("Cool.");
  }
  
  */
}
}