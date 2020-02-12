package exercise1;

import java.util.Scanner;

public class DigitCube {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		   
	    int num=sc.nextInt();
	FunctionClass ab=new FunctionClass();
	System.out.println(ab.sum(num));
	sc.close();
	}
}
