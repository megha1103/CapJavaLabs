package exercise8;

public class FunctionClass {

	public static void stringCheck(String s)
	{
		int f=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			{
				f=0;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
	
	
}
