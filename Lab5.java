/*
  Name
  Co Sci 290
  
  Lab 5
  - fix the logic and make this code check if each character is a letter
  
  objectives: 
    -check if input is at least two characters
    -check that input is all letters
    -prompt user to input again until conditions are met 
*/

/*    
            !!!STRATEGY!!!
   make 2 variables to become false when criteria is not met
          -moreThanTwoChar, allLetters
        initialize variables
   
   Major Loop Start
      - if either is false, the loop will be used
      
      - set moreThanTwoChar = false, allLetters to be true
        this resets conditions if loop is repeated
        they will become true along the way if they meet criteria
        
        First Test
        if ( length >= 2) , set moreThanTwoChar = True
        
        Second Test - Minor Loop
        Use loop to check each letter
        if char is a letter,  do nothing
        else allLetters = false
        
        What to do when criteria not met
        if !moreThanTwoChar || !allLetters
        message "Please enter ... More than 2 ... all Letters"
        
        then loop will start again is either criteria no met
        
   end MajorLoop
   
   successful name enter
   "Your name is " + name "!"
        

*/
import java.util.Scanner;
public class Lab5{

  public static void main(String[] args){
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    
    
    
    String answer = "";
    boolean allLetters = true;
    boolean moreThanTwoChar = false;
    
    //Start with a big loop that will start
    //when criteria is not met
    while(!allLetters || !moreThanTwoChar){
      //reset booleans
      allLetters = true;
      moreThanTwoChar = false;
      
      //ask for user input
      System.out.println("What is your name?");
      //get user input
      answer = input.next();
      
      //check if name length >= 2 and change
      //appropriate boolean if true
      if(answer.length() >= 2){
        moreThanTwoChar = true;
      }
      
      //loop to look at each individual char and determine
      //if they are all letters. if letter,  nothing happens
      //if not letter,  boolean changes
      //this ensures loop will look at each char and only
      //change when criteria not met.
      
      //look at each char
      for(int index = 0; index < answer.length(); index++){
        //if char != letter, change boolean to false
        if(!Character.isLetter(answer.charAt(index))){
          allLetters = false;
        }
      }
      
      //prints message if criteria not met
      if(!moreThanTwoChar || !allLetters){
        System.out.println("Please enter a name that is\n"
                          + "at least two characters long!\n"
                          + "You can only use letters!");
      }
    }
    
    //At this point, input should have reached
    //criteria
    
    //Message for successful input
    System.out.println("So your name is "
                      + answer + "? What a lovely name!");
    
  } //end of main method
} //end of class