/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;
import java.io.FileOutputStream;    

public class try_with_resource_single_resource {
    
 public static void main(String args[]){      
        // Using try-with-resources  
    try(FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt"))// using resource with try.
    {      
        String msg = "Welcome to javaTpoint!";      
        byte byteArray[] = msg.getBytes(); //converting string into byte array      
        fileOutputStream.write(byteArray);  
        System.out.println("Message written to file successfuly!");      
    }
    catch(Exception exception)
    {  
         System.out.println(exception);  
    }      
}      
    
}
