/*
  Christian Castillo
  Co Sci 290
  22 March 2018
*/
import java.util.Scanner;
public class Midterm{
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
   
    //code from http://javadevnotes.com/java-split-string-into-array-of-integers-example
   
    
    
    //shoud put result into a plain english statement
    statement(isSorted(intArray), intArray);
    
  }
  
  //method to check if list is sorted
  public static boolean isSorted(int[] list){
    boolean sorted = true;
    //skips list[0] as that is not supposed to be counted in the array
    for(int i = 1; i < (list.length - 1); i++){
     //switches boolean to false when following element is less than one before it
      if(list[i] > list[i+1]){
        sorted = false;
      }
    }
    return sorted;
  }

  public static void statement(boolean sortedOrNot, int[] nums){
    if(sortedOrNot == true){
      System.out.println("This list is sorted!");
    }

    else{
      System.out.println("This list is NOT sorted \n \n" + 
                        "The sorted list is:");
      //prints out members of array
      int[] entriesInOrder = sortArray(nums);
      for(int k = 1; k < entriesInOrder.length; k++){
        System.out.print(entriesInOrder[k] + "\t");
      }
      System.out.print("\n");
    
     
    }

  }
  
 //Using selection sort as described in 7.8
  public static int[] sortArray(int[] list){
    int[] sortedList;
    for(int i = 1; i < list[0]; i++){
      //find the smallest member from i to end
      int currentMinimum = list[i];
      int currentMinimumIndex = i;
      
      
      for(int j = i+1; j < list[0]; j++){
        if(currentMinimum > list[j]){
          //when smaller number is found, 
          //program will hold onto that number and its index
          currentMinimum = list[j];
          currentMinimumIndex = j;
        }
      }
      //swap current minimum number with earliest unsorted index
      if(currentMinimumIndex != i){
        //places earliest member into smallest member's index
        list[currentMinimumIndex] = list[i];
        //places smallest member at earliest index
        list[i] = currentMinimum;
      }
      
    }
    sortedList = list;
    
    return sortedList;
  }
    
  
}//end class


