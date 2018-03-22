/*
  Christian Castillo
  Co Sci 290
  22 March 2018
*/
import java.util.Scanner;
public class Lab11{
  public static void main(String[] args){
    //main method
    String numbers = "";
    String[] numbersArray;
    int[] nums;
    Scanner input = new Scanner(System.in);
    //asks user input
    System.out.println("Please type the number of elements, followed by the elements");
    
    //take in numbers
    numbers = input.nextLine();
    //puts input int a string array, numbers sepereated by space
    numbersArray = numbers.split(" ");
    //take contents of string array and puts into int array
    
     String[] stringArray = numbers.split(" ");
     int[] intArray = new int[stringArray.length];
     for (int i = 0; i < stringArray.length; i++) {
        String numberAsString = stringArray[i];
        intArray[i] = Integer.parseInt(numberAsString);
     }
     System.out.println("Number of integers: " + intArray.length);
     System.out.println("The integers are:");
     for (int number : intArray) {
        System.out.println(number);
     }
    
    //code from http://javadevnotes.com/java-split-string-into-array-of-integers-example
   
    
    
    //shoud put result into a plain english statement
    statement(isSorted(intArray));
    
  }
  
  //method to check if list is sorted
  public static boolean isSorted(int[] list){
    boolean sorted = true;

    for(int i = 1; i < (list.length - 1); i++){
     //switches boolean to false when following element is less than one before it
      if(list[i] > list[i+1]){
        sorted = false;
      }
    }
    return sorted;
  }

  public static void statement(boolean sortedOrNot){
    if(sortedOrNot == true){
      System.out.println("This list is sorted!");
    }

    else{
      System.out.println("This list is NOT sorted");
    }

  }
    
  
}//end class


