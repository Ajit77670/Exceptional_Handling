/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class finally_File_Not_Found_Exception {
    
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis  = null;
        
        try
             {
                 fis= new   FileInputStream("d:/abc.txt");  
             }
        catch(FileNotFoundException e)
                {
                    System.out.println("File not found");
                }
        finally
        {
            if(fis!=null)
            {
                fis.close();
            }
            
            System.out.println("File closed");
        }
    }
    
}
