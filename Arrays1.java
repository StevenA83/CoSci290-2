/*
  Christian Castillo
  Co Sci 290
  
  Intro to arrays
  
*/

public class Arrays1{
  public static void main(String [] args){
    
    //declare an array of type int
    String[] numbers = new String[10];
    
    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
    
    //assign element at index 3, "five"
    numbers[3] = "five";
    //numbers[11] = "twenty";
    //cant do this, will give arrayIndexOutOfBounds error
    
    //redeclare with a different size because you cant addor remove
    numbers = new String[8];
  }
}