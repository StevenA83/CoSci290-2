/*
  Christian Castillo
  CoSci 290
  
  15 March 2018
  
  using ArrayList
  
  Advantages of ArrayList:
  size of ArrayList can grow!
  can remove an item and gap will automatically be filled!
  
  
*/
import java.util.*;
public class MidtermBonus{
  
  //main method
  public static void main(String[] args){
    
    //declare an array of student
    //uppercase name refers to object, lowercase is local variable
    ArrayList<Student> students = new ArrayList<Student>();
    
    //creating indexes to be able to store grades and mojors to list
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    
    //Adding indexes to ArrayList
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    
    
    //assigning values
    s1.setGpa(2.3);
    s1.setMajor("Electrical Engineering");
    
    //second student entry
    s2.setGpa(3.5);
    s2.setMajor("Psychology");
    
    s3.setGpa(3.8);
    s3.setMajor("Math");
    
    s4.setGpa(4.0);
    s4.setMajor("Kinesiology");
    
    s5.setGpa(3.0);
    s5.setMajor("Art");
    
    //sorts students by GPA
    students = sortArray(students);
    
    //sort the Arraylist of objects
    System.out.println("The Students in order of GPA are:");
    //calls for PrintStudent
    printStudent(students);
    
  }//end main
  
  //function for printing
  public static void printStudent(ArrayList<Student> students){
    for(int i = 0; i < students.size(); i++){
      System.out.println(students.get(i).toString());
    }
  }
  
   //Using selection sort as described in 7.8
  public static ArrayList<Student> sortArray(ArrayList<Student> students){
    ArrayList<Student> sortedList;
    for(int i = 0; i < students.size() - 1; i++){
      //find the smallest member from i to end
      Student currentMinimum = students.getGpa[i];
      int currentMinimumIndex = i;
      
      
      for(int j = i+1; j < students.size(); j++){
        if(currentMinimum.getGpa > students.getGpa(j)){
          //when smaller number is found, 
          //program will hold onto that number and its index
          currentMinimum = students.get(j);
          currentMinimumIndex = j;
        }
      }
      //swap current minimum number with earliest unsorted index
      if(currentMinimumIndex != i){
        //places earliest member into smallest member's index
        students.set[currentMinimumIndex] = students.get(i);
        //places smallest member at earliest index
        students.set(i) = currentMinimum;
      }
      
    }
    sortedList = students;
    
    return sortedList;
  }
  
}