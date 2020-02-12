package exercise2;

public class FunctionClass {

	 int calculateDifference(int n) 
	{
		int s1=0,s2=0;
		for(int i=1;i<=n;i++)
		{
			s1+=(i*i);
		}
		for(int i=1;i<=n;i++)
		{
			s2+=i;
		}
		return (s1-(s2*s2));
	}


	
	
}
