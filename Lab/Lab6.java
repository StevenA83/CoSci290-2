/*
  Christian Castillo
  CoSci 290
  
  use custom objects
*/

public class Lab6{
  
  //main method
  public static void main(String[] args){
    
    //declare an array of student
    //uppercase name refers to object, lowercase is local variable
    Student[] students = new Student[5];
    
    //instantiate each Student object
    Student s1 = new Student();
    
    //add student object to array
    //first object in array is named s1
    students[0] = s1;
    
    //assigning values
    s1.setGpa(3.40);
    s1.setMajor("Computer Science");
    
    //second student entry
    Student s2 = new Student();
    students[1] = s2;
    s2.setGpa(2.9);
    s2.setMajor("Chemical Engineering");
    
    //third student entry
    Student s3 = new Student();
    students[2] = s3;
    s3.setGpa(3.1);
    s3.setMajor("Child Development");
    
    //fourth entry
    Student s4 = new Student();
    students[3] = s4;
    s4.setGpa(2.9);
    s4.setMajor("Mechanical Engineering");
    
    //fifth entry
    Student s5 = new Student();
    students[4] = s5;
    s5.setGpa(2.9);
    s5.setMajor("Chemical Engineering");
    
    //prints info as a loop
    
    for(int index = 0; index <= 4; index++){ 
     System.out.println("Student's GPA: " + students[index].getGpa());
     System.out.println("Student's Major is: " + students[index].getMajor() + "\n \n");
    }
  }
  
}