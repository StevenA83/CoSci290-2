/* 
  Christian Castillo
  Co Sci 290
  Testing Arrays
*/

import java.util.*; // asterix is a wildcard, will import all util
public class TestArrayList{
  
  public static void main(String [] args){
    
    //instantiate ArrayList of int objects
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    //add stuff to list
    list.add(30);
    list.add(100);
    
    //get an  element
    System.out.println("First element: " + list.get(0)); // 30
    
    //remove an element
    list.remove(0);
    
    System.out.println("First Element after removal: " + list.get(0)); // 100 - element shifted over!!!
    
    list.add(1);
    list.add(13);
    list.add(2, 50); //overloaded add method
    
    System.out.println("Iterate through list ...");
    
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
    
    
  }
}