package exercise4;

import java.util.Scanner;

public class NextAlphabet {
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter String ");
    String str=sc.nextLine();
    System.out.println(abc(str.toCharArray()));
    
    sc.close();
}

	public static String abc(char s[])
	{
	    for (int i = 0; i < s.length; i++) 
	    {
	    	if(s[i]=='z')
	    	{
	    		s[i]='a';
	    	}
	    	else
	    	s[i] = (char) (s[i] + 1); 
	    }
	    return String.valueOf(s);
	}
}

