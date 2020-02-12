package exercise5;

public class FunctionClass {
public static void modifyNumber(int n)
{
	 String s=String.valueOf(n);
	 // String s=Integer.toString(a); 
//	   sbf1.append(true); 
	 StringBuffer buffer = new StringBuffer();
	 for(int i=0;i<s.length()-1;i++)
	 {
		 int p=Math.abs(s.charAt(i)-s.charAt(i+1));
		 buffer.append(p);
	 }
	 buffer.append(s.charAt(s.length()-1));
	 System.out.println(buffer);
}
}
