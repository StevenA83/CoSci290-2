/*
	Christian Castillo
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * *
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
  * * * * *
	  * * * *
	    * * *
	      * *
	        *
	4. Fix the indentation of the code.
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class Lab12{ //name of class should start in uppercase

    public static void main(String[] args) { //formatted for readability added missing brackets

        int i;
        int j; //re formatted for readability
        int k; //added missing variable declaration

        //this loop prints top portion of diamond
        for(i=1;i<=5;i++) { //formatted for readability. changed inequality so it starts as true
            for(j=i;j<5;j++) { //moved for readability
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++) { //formatted for readability
                System.out.print("*"); //missing semicolon
            }
            System.out.println(); // capitalized "System"
        }
			
				//prints bottom portion of diamond
        for(i=4;i>=1;i--) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
							//adds decreasing amount of *
                System.out.print("*");
            }
					//creates a new line
            System.out.println("");
        }
    //} removed so main holds calling of method
//} removed so Lab12 class holds all code

    printTriangle();
	} 

public static void printTriangle(){
	
	//uses code similar to bottom portion on diamond but
	//half as many * printed
	for( int a = 5; a > 1; a--){
		for(int b = 5; b >=a; b--){
			System.out.print(" ");
		}
		for(int c = 1; c < a; c++){
			System.out.print("*");
		}
		System.out.println();
	}
   }
}