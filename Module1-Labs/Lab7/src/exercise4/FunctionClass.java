package exercise4;

import java.util.HashMap;

public class FunctionClass {
	public static void getStudents()
	{
	HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	m.put(1234, 99);
	m.put(8861, 89);
	m.put(9823, 98);
	m.put(9123, 75);
	m.put(6749, 92);

	HashMap<Integer,String> m1=new HashMap<Integer,String>();
	for (Integer i : m.keySet()) {
		 if(m.get(i)>=90)
		 {
			 m1.put(i,"Gold");
		 }
		 else if(m.get(i)>=80 && m.get(i)<=90)
			
			 {
				 m1.put(i,"Silver");
			 }
		 else if(m.get(i)>=70 && m.get(i)<=80)
			 {
				 m1.put(i,"Bronze");
			 }
		}
	System.out.println(m1);
}
}
