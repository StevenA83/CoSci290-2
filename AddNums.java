import java.util.Scanner;
public class AddNums{
  public static void main(String [] args){
   
    long num = 0;
    Scanner input = new Scanner(System.in);
    
    num = input.nextInt();
    
    int modulus = 0;
    int sum = 0;
    int divideBy = 10
    
    for(int i = 1; num < Math.pow(10, i); i++){
      sum += num % (Math.pow(divideBy,i)) - modulus;
      modulus +=num % (Math.pow(divideBy,i)) - modulus;
    }
    
    System.out.println(sum);
  }
}