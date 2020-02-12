package exercise3;

import java.util.Scanner;

public class MirrorString {
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
      System.out.print("\nEnter String ");
      String str=sc.nextLine();
     FunctionClass.getImage(str);
      sc.close();
   }  
      
	}
