/*  Christian Castillo
    Co Sci 290
    22 February 2018
    
    Topics:
    functions/methods - what all the different parts are
    - access modifier
    - return type
    - function name
    - parameters (optional)
*/

public class TestFunctions{
  
  //entry point of application
  public static void main(String [] args){
  
    /*  public is an access modifier
        access modifiers
        public - anything can see/access
        private - only functions within a class can access
        default - same thing as no written/declared modifiers
        
        return types
        -int
        -double
        -String
        -char
        -boolean
        -void - doesnt return anything
        -also can return different object type
        
        function names
        -follows the same rules as any identifier
        -use the name of the function to call it
        
        function parameters
        -input that the function uses inside somewhere in the function body
        -seperate multiple parameters with commas
        
        
        
    */
    //testing out new function
    System.out.println("The sum of 2 and 3 is " + findSum(2,3));
   
    printHello("Chris");
  
  }
  
  //Here is a function! it has to be outside of main
  //access modifier, return type, function name, parameters
  public static int findSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
  }
  
  public static void printHello(String name){
    System.out.println("Hello " + name);
  }
}
