package exercise1;
import java.util.Scanner;
public class FunctionClass {
	   public void traffic()
	   {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("write red or yellow or green");

    String s = myObj.nextLine();  // Read user input
	if(s.equals("red"))
		{
			System.out.println(" Stop ");
		}
	else if(s.equals("yellow"))
		{
			System.out.println(" ready ");
		}
	else if(s.equals("green"))
		{
			System.out.println(" go ");
		}
  System.out.println(" you have chosen " +s );  // Output user input
}
}
