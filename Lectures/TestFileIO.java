/*
  Christian castillo
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{
  public static void main(String[] args){
    
    String currentLine; //hold current line being read
    String fileName = "text.txt"; //hold the relative path of a fileName
    
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
      
      //read each line in the file until the EOF
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
    }
      
    catch(IOException e){
      e.printStackTrace();
    }
    
  }
}