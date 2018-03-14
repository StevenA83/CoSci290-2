/*  Christian Castillo
    13 March 2018
    Co Sci 290
    
    print out Student information
*/

public static void PrintStudents(Student[] students){
  for(int i = 0; i < students.length; i++){
    System.out.println(students[i].toString());
  }
  return null;
}

