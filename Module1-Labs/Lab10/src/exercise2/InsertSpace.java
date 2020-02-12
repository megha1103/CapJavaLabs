package exercise2;
interface AddSpace
{
	String abstractFun(String s);
}
public class InsertSpace {
	public static void main(String args[]) 
    {  
     AddSpace obj=(s)-> {
    	 String s1="";
    	 for(int i=0;i<s.length();i++)
    	 {
    		 s1+=s.charAt(i);
    		 s1+=' ';
    	
    	 }
    	 return s1; 	
     };
     
     System.out.println(obj.abstractFun("abcde"));
    }
}
