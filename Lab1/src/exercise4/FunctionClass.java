package exercise4;

public class FunctionClass {

	 Boolean checkNumber(int n) 
	{
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		
		}
		return true;
		
		/*if((n&n-1)==0)
		{
			return true;
		}
		return false;
		*/
	}
}
