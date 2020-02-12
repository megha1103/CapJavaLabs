package exercise7;

import java.util.Collections;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		    System.out.print("\nEnter Number ");
		    int n=sc.nextInt();
		    String s=String.valueOf(n);
		    StringBuilder sb=new StringBuilder(s);  
		    sb.reverse(); 
		    
		    System.out.println(sb.toString());  
		    sc.close();
		    
	}
}
