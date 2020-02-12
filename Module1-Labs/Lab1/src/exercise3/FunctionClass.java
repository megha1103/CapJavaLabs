package exercise3;

public class FunctionClass {
	 Boolean checkIncreasingNumber(int num) 
		{
		 boolean flag=true;
		   int currentDigit=num%10;
	       num=num/10;
	       while(num>0)
	       {
	    	   if(currentDigit<=num%10)
	    	   {
	    		   flag=false;
	    		   break;
	    	   }
	    	   currentDigit=num%10;
	    	   num=num/10;
	       }
	       
	    return flag;
		}

}
