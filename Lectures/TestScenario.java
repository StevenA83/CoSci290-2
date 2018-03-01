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
    int randomNum = min +(int)(Math.random() * max);
    
    //use RNG + if/else if/else to give ammunition
    if(randomNum >90){
      weaponBattery = 100;
      System.out.println("Your PLASMA GUN is at " + weaponBattery + "% charge!");
    }
    
    else if(randomNum >= 25 && randomNum <=90){
      weaponBattery = randomNum;
      System.out.println("Your PLASMA GUN is at " + weaponBattery + "% charge. Find some POWER to fill it up!");
    }
    else{
      System.out.println("Your PLASMA GUN is out of charge. Its useless until you put some POWER in it!");
    }
    //critical hit
    
    randomNum = min +(int)(Math.random() * max);
    
    if(randomNum >90){
      System.out.println("You killed the enemy in one hit!");
    }
    else{
      System.out.println("You did 5 DMG to the enemy!");
    }
    
  }
  
}