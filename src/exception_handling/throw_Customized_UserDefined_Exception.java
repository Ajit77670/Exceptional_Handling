/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException // Created User/Customiezed Exception 
{                                                  // Always try to create unchecked user/customized Exception 
                                                   // user/Customized Exceptions always etends RuntimeException
    YoungerAgeException(String msg) 
    {
        super(msg); // Passing this msg with super keyword to its parent class Exception (Default Exceptional handler)
    }
    
}
public class throw_Customized_UserDefined_Exception {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Creating Scanner
        
        System.out.println("Please Enter your Age");
        
        int age =sc.nextInt();
       
        try         // Writting risky code in try block 
        {
            if(age<18)
            {
                throw new YoungerAgeException("You are not eligible for voting"); // now using throw keyword we are using our 
                                                                                        //user/customized exception.
            }  
             else 
            {
                 System.out.println("Voted Sucessfully");
            }
        }
        
        catch(YoungerAgeException e) // Handling the risky code by providing alternate method of Exception
        {
           e.printStackTrace(); // it will print Exception class name, description and exception error line no. in prgrm.
        }
        
         System.out.println("OOPS try Again!!"); // Just to chk if this sttement print so that we come to know 
                                                    //exception handling done smoothly and our programe dint terminate abnormally.
    }   
        
    
}
