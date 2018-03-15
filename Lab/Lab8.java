<<<<<<< HEAD
/*
  Christian Castillo
  CoSci 290
  
  13 March 2018
  
  use custom objects
*/

public class Lab8{
  
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
    s1.setGpa(2.3);
    s1.setMajor("Electrical Engineering");
    
    //second student entry
    Student s2 = new Student();
    students[1] = s2;
    s2.setGpa(3.5);
    s2.setMajor("Psychology");
    
    
    //third student entry
    Student s3 = new Student();
    students[2] = s3;
    s3.setGpa(3.8);
    s3.setMajor("Math");
    
    //fourth entry
    Student s4 = new Student();
    students[3] = s4;
    s4.setGpa(4.0);
    s4.setMajor("Kinesiology");
    
    //fifth entry
    Student s5 = new Student();
    students[4] = s5;
    s5.setGpa(3.0);
    s5.setMajor("Art");
    
    //calls for PrintStudent
    
    printStudent(students);
    
    //prints info as a loop
    
    /*for(int index = 0; index <= 4; index++){ 
     System.out.println("Student's GPA: " + students[index].getGpa());
     System.out.println("Student's Major is: " + students[index].getMajor() + "\n \n");
    }    */
  }//end main
  
  //function for printing
  public static void printStudent(Student[] students){
    for(int i = 0; i < students.length; i++){
      System.out.println(students[i].toString());
    }
  }
  
  
=======
/*
  Christian Castillo
  CoSci 290
  
  13 March 2018
  
  use custom objects
*/

public class Lab8{
  
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
    s1.setGpa(2.3);
    s1.setMajor("Electrical Engineering");
    
    //second student entry
    Student s2 = new Student();
    students[1] = s2;
    s2.setGpa(3.5);
    s2.setMajor("Psychology");
    
    
    //third student entry
    Student s3 = new Student();
    students[2] = s3;
    s3.setGpa(3.8);
    s3.setMajor("Math");
    
    //fourth entry
    Student s4 = new Student();
    students[3] = s4;
    s4.setGpa(4.0);
    s4.setMajor("Kinesiology");
    
    //fifth entry
    Student s5 = new Student();
    students[4] = s5;
    s5.setGpa(3.0);
    s5.setMajor("Art");
    
    //calls for PrintStudent
    
    printStudent(students);
    
    //prints info as a loop
    
    /*for(int index = 0; index <= 4; index++){ 
     System.out.println("Student's GPA: " + students[index].getGpa());
     System.out.println("Student's Major is: " + students[index].getMajor() + "\n \n");
    }    */
  }//end main
  
  //function for printing
  public static void printStudent(Student[] students){
    for(int i = 0; i < students.length; i++){
      System.out.println(students[i].toString());
    }
  }
  
  
>>>>>>> db29a554ba5326d887841c7c672dc562739eb243
}