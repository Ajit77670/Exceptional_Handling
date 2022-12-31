/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class try_with_resource_Multiple_resource {
    
    public static void main(String args[]) throws IOException {
      System.out.println(readData("test"));
    
}
    
static String readData(String message) throws IOException 
{
      try(Reader inputString = new StringReader(message);BufferedReader br = new BufferedReader(inputString)) 
                        // Declaring Multiple resource with try.
      {
         return br.readLine();
      }
   }
}
