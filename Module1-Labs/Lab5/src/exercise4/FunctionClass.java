package exercise4;

import java.util.Scanner;

public class FunctionClass {
public void check()
{
	try
	{
	Scanner sc = new Scanner(System.in);  // Create a Scanner object
   
    String firstname = sc.nextLine(); 
    String lastname = sc.nextLine();
    if(firstname.equals("") || lastname.equals(""))
    {
    throw new validate("empty values"); 
    }  
    else
    {
    	System.out.print("ok");
    }
	}	
	 catch (validate ex) 
    { 
        System.out.println("Caught"); 

        // Print the message from MyException object 
        System.out.println(ex.getMessage()); 
    } 	
}
}

