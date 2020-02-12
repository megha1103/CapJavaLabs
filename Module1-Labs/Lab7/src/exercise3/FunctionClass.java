package exercise3;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionClass {
public static void getSquares()
{
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(4);
	a.add(2);
	a.add(9);
	a.add(5);
	a.add(8);
	HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	for(int i:a)
	{
		m.put(i, (i*i));
	}
	System.out.println(m);
}
}
