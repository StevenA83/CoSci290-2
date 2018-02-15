/*
  Christian Castillo
  Co Sci
  15 Feb 2018
  
  Demo topic on:
    - increment/decrement operators
    - augmented assignment operators
    - basic if else operators
    - 
*/

public class DemoBoolean{
  
  public static void main(String [] args){
    
    /*
    line 17 and 18 are equivalent
    
    int num = 1;
    num = num + 1; //increment num by 1
    num++; //post increment
    ++num;
    */
    
    int num = 1;
    int count = ++num; //pre-increment 
    System.out.println("count " + count + "\tnum " + num);
    num = 1;
    count = num++; //post-increment
    System.out.println("count " + count + "\tnum " + num);
    
    count = num--;
    count = --num;
    
    //examples of augmented assignment operatores
    num += 2; //same as num = num * 2;
    num -= 2;
    num *= 2;
    num /= 2;
    
    num = 2;
    double num2 = 3.0;
    System.out.println("Double wins: " + num * num2);
    System.out.println("Casting a double to int: " + (int) num2); //lose the decimal part
    System.out.println("Casting an int to a double: " + (double) num); //lose the decimal part
    System.out.println("Casting a char to an int: " + (int) 'c'); // turns the c into 99 b/c ASCII
    
    int numberOfZombies = 3;
    
    if(numberOfZombies < 5){
      System.out.println("You might survive this apocalypse.");
    }
    else{
      System.out.println("You might NOT survive this apocalypse.");
    }
    
    //generating a random number
    Math.random(); //random number between 0 and 1
    
    System.out.println(1 + (int)(Math.random() *10));
  }

}