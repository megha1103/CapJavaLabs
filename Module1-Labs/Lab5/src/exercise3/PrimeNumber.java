package exercise3;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
	System.out.println("Enter integer");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	FunctionClass ab=new FunctionClass();
	ab.prime(n);
	}
}
