/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class throws_Exceptions_Handling {
    
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
        
        throws_Exceptions_Handling EX = new throws_Exceptions_Handling();
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
