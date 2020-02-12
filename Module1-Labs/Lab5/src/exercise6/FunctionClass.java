package exercise6;
import java.util.Scanner;

public class FunctionClass extends Exception {

	FunctionClass( String s)
	{
		super(s);
	}
	
	public static void main(String[] args) {
		try
		{
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	   
	    int salary=sc.nextInt();
	    if(salary<3000)
	    {
	    throw new FunctionClass("Salary should be greater than 3000"); 
	    }  
	    else
	    {
	    	System.out.print("ok");
	    }
		}	
		 catch (FunctionClass ex) 
	    { 
	        System.out.println("Caught"); 

	        // Print the message from MyException object 
	        System.out.println(ex.getMessage()); 
	    } 	
	}
}
