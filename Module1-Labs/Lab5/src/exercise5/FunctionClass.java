package exercise5;

import java.util.Scanner;



public class FunctionClass {
public void validate()
{
	try
	{
	Scanner sc = new Scanner(System.in);  // Create a Scanner object
   
    int age=sc.nextInt();
    if(age<=15)
    {
    throw new ValidateAge("Age should be greater than 15"); 
    }  
    else
    {
    	System.out.print("ok");
    }
	}	
	 catch (ValidateAge ex) 
    { 
        System.out.println("Caught"); 

        // Print the message from MyException object 
        System.out.println(ex.getMessage()); 
    } 	
}
}

