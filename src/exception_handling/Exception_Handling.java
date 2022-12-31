/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_handling;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Exception_Handling {
    
    void readfile() throws FileNotFoundException
        {
        
            FileInputStream fi = new  FileInputStream("d:/abc.txt");
        }
        
        void savefile()throws FileNotFoundException
        {
             FileInputStream fs = new  FileInputStream("d:/abc.txt");
        }
    
}

class Test
{
    public static void main(String args[])
    {
        
        Exception_Handling EX = new Exception_Handling();
        try
        {
        EX.readfile();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Hello");
    }
}



    
   
