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
public class Lab9{
  
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
    
    //calls for PrintStudent
    printStudent(students);
    
  }//end main
  
  //function for printing
  public static void printStudent(ArrayList<Student> students){
    for(int i = 0; i < students.size(); i++){
      System.out.println(students.get(i).toString());
    }
  }
}