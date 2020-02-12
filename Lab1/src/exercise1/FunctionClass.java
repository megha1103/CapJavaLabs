package exercise1;

public class FunctionClass {
	 int calsum(int x) {
        int sum=0;
	   for(int i=1;i<=x;i++)
	   {
		   if(i%3==0 || i%5==0)
		   {
		   sum+=i;
		   }
	   }
	  return sum;
	}
}
