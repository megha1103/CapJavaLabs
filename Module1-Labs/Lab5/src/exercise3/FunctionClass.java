package exercise3;



public class FunctionClass {
	public void prime(int n)
	{
	
	for(int i=1;i<=n;i++)
	{
		int flag=1;
		int j;
		for( j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(i);
		}
	}
}
}
