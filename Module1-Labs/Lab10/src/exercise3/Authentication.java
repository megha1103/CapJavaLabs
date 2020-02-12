package exercise3;
import java.util.Scanner;
interface checkValid
{
	boolean verifyFun(String username, String password );
}
public class Authentication {

	
	public static void main(String args[])
	{
		checkValid obj=(username,password)->{
		  String u="abc";
		  String p="def";
		  if(username==u && password==p)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String us=sc.next();
		System.out.println("Enter password: ");
		String pa=sc.next();
		
		System.out.println(obj.verifyFun(us,pa));
		sc.close();
		
	}
}
