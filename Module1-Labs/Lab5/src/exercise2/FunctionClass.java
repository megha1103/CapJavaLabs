package exercise2;

public class FunctionClass {
	  void fib(int n)
		 {
		 	int a=0;
		 	int b=1;
		 	System.out.println(a+"\n"+b);
		 	
		 	for(int i=0;i<=n;i++)
		 	{
		 		int c=a+b;
		 		System.out.println(c+" ");
		 		a=b;
		 		b=c;
		 	}
		 }
}
