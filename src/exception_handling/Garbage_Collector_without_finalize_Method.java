//Question: Suppose you go for the internship at GeeksForGeeks, 
//and you were told to write a program to count the number of employees working in the company(excluding interns).
//To make this program, you have to use the concept of a garbage collector. 

/*This is the actual task you were given at the company:
Write a program to create a class called Employee having the following data members. 
        
1. An ID for storing unique id allocated to every employee. 
2. Name of employee. 
3. age of an employee.

Also, provide the following methods:

A parameterized constructor to initialize name and age. The ID should be initialized in this constructor.
A method show() to display ID, name, and age.
A method showNextId() to display the ID of the next employee.

Now any beginner, who doesn’t know Garbage Collector in Java will code like this: */


package exception_handling;

class Employee{  // Craeted class Employee with given data members.
    
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

public Employee(String name, int age) // Craeted parameterized constructor intializing name and age.
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

public void show() // Method to show ID, name and age.
    {
        System.out.println("Id=" + ID + "\nName=" + name
                           + "\nAge=" + age);
    }

public void showNextId() // Method for showing nextId.
    {
        System.out.println("Next employee id will be="
                           + nextId);
    }

}

public class Garbage_Collector_without_finalize_Method {
    
    public static void main(String[] args)
    {
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();
        
        { // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
        }
        
        // After countering this brace, X and Y
        // will be removed.Therefore,
        // now it should show nextId as 4.
           
          // Output of this line
        E.showNextId();
        // should be 4 but it will give 6 as output. 
        //we need to use Garbage Collector to get the deisired output. 
        // We should exclude the interns id to show the output as 4 by making interns value as null.
    }
}
    

