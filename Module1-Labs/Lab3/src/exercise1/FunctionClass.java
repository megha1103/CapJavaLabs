package exercise1;

public class FunctionClass {

	int find(int a[],int n)
	{
		int s=a[0];
		int sl=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<s)
			{
				sl=s;
				s=a[i];
			}
		}
		
		return sl;
	}
}
