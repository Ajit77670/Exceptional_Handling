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

Now to get the correct output: 
Now garbage collector(gc) will see 2 objects free. Now to decrement nextId,gc(garbage collector) will call method to finalize() only when we programmers have overridden it in our class. 
And as mentioned previously, we have to request gc(garbage collector), and for this, we have to write the following 3 steps before closing brace of sub-block.  

Set references to null(i.e X = Y = null;)
Call, System.gc();
Call, System.runFinalization();
Now the correct code for counting the number of employees(excluding interns) .*/

package exception_handling;

// Correct code to count number
// of employees excluding interns.
 
class Employee {
   
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
   
    // it is made static because it
    // is keep common among all and
    // shared by all objects
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                           + "\nAge=" + age);
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                           + nextId);
    }
    protected void finalize()
    {
        --nextId;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}

public class Garbage_Collector_Using_finalize_Method {
    
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
 
        {
            // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc(); // Garbage collector calls
            System.runFinalization(); // running finalization method.
        }
        E.showNextId();
    }
}
    

