/*
  Christian Castillo
  Co Csi 290
  20 March 2018
  Lab 10
  
  Write two overloaded methods that return the 
  average of an array with the following headers:

  public static int average(int[] array)

  public static double average(double[] array)

  Write a test program that prompts the user to 
  enter ten double values, invokes this method, 
  and displays the average values
*/
import java.util.*;

public class Lab10{
  public static void main(String[] args){
    
    //allow user input
    Scanner input = new Scanner(System.in);
    
    //asks user for 10 inputs
    System.out.println("Please enter 10 numbers: ");
    
    //establish ArrayList
    ArrayList<Double> nums = new ArrayList<Double>();
    
    for(int i = 0; i < 10, i++){
      //takes user input for array
      nums.add(input.nextDouble);
      
    }
    
  }
}


public static int average(int[] array){
  int sum = 0;
  int avg;
  int count = 0
  
  for(int i = 0; i < array.length; i++){
    sum += array[i];
    count++;
  }
  avg = sum / count;
  
  return avg;
}

public static double average(double[] array)
  double sum = 0;
  double avg;
  int count = 0
  
  for(int i = 0; i < array.length; i++){
    sum += array[i];
    count++;
  }
  avg = sum / count;
  
  return avg;
}