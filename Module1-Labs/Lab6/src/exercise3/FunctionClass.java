package exercise3;

public class FunctionClass {
 public static void getImage(String str)
 {
	 StringBuffer buffer = new StringBuffer(str);
     buffer.reverse();
     System.out.println(str+" | "+buffer);
 }
}
