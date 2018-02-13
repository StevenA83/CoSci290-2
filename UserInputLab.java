//Christian Castillo
//CS290
//13 February 2018

//take three user inputs for text adventure game


import java.util.Scanner; //enable reading user input
public class UserInputLab{
  public static void main(String[] args){
    
    String name = " ";
    String planet = " ";
    int age = 0;
    Scanner input = new Scanner(System.in); //user input will be stored in var input
    
    //lets users name character
    System.out.println("What is your name?");
    name = input.next();
    
    System.out.println("So it's " + name + "? That's nice. What planet were you born on?");
    planet = input.next();
    
    System.out.println("Oh, you're from " + planet + "? I've got a cousin who lives there!"
                       + "\nHow old are you in " + planet + " years, " + name + "?");
    age = input.nextInt();
    
    System.out.println( age + "? That's about " + (age * 7) + " cycles here on mars.");
    
    
  
    
  }
}