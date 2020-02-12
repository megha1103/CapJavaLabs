package exercise1;

import java.util.StringTokenizer;

public class FunctionClass {
public static void abc(String s)
{
	int sum=0,n;
	  StringTokenizer st = new StringTokenizer(s, " ");
      while (st.hasMoreTokens()) {
          String temp = st.nextToken();
          n = Integer.parseInt(temp);
          System.out.println(n);
          sum = sum + n;
      }
      System.out.println("sum of the integers is: " + sum);
}
}
