/*
  Christian Castillo
  Co Sci 290
  20 February 2018
  
 Lab 3
  1. Using if - else if - else, create a scenario that
    sets up your character/user with random objects/situations
    
  2. Use random number generator
  
  3. Use at least one compound/complex condtional with a logical 
    operator, e.g. randomNum <= 80 && randomNum >= 70
*/

public class TestScenario{
  public static void main(String [] args){
    
    //set up RNG
    int min = 1;
    int max = 100;
    int weaponBattery = 0;
    int randomNum = minimum +(int)(Math.random() * maximum);
    
    //use RNG + if/else if/else to give ammunition
    if(randomNumber >90){
      weaponBattery = 100;
      System.out.println("Your PLASMA GUN is at " + weaponBattery + "% charge!");
    }
    
  }
  
}