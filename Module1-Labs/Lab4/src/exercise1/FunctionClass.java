package exercise1;


public class FunctionClass {
	public int sum(int n)
	{
		int sum=0;
		int d;
		while(n>0)
		{
			d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		return sum;
	}
	
}
