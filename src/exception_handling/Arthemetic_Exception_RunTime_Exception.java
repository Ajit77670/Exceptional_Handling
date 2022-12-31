/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;


public class Arthemetic_Exception_RunTime_Exception {
    
   public static void main(String args[]){
    
       try{
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
          }
        catch(ArithmeticException ae) // Passing ArtemeticException with its builtin reference "ae".
        {                             // we can pass the Parent exception if we dont know which type of exception it is.
                                        //i.e (Exception e ) , parent class of all Exceptions.
            System.out.println(ae);  //this will print exception class name  and description
            System.out.println(ae.getMessage()); //this will print exception class name  and description
            System.out.println(ae.toString());  //this will print exception description only.
            ae.printStackTrace();   // this will print exception class name , 
                                   //description and stack trace(i.e in which line exception occur)
        }    
       
       System.out.println("hello");  // This statement to cross chk if this line executing after we handle the exception.
       
     }
}
            
           
                
               
                
                 
            
          
    

