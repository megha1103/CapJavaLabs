package exercise6;

import java.util.ArrayList;
import java.util.HashMap;

public class EligibleForVote {
	public static void main(String[] args)
	{
	HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	m.put(1234, 24);
	m.put(8861, 12);
	m.put(9823, 40);
	m.put(9123, 9);
	m.put(6749, 30);
	ArrayList<Integer>al=new ArrayList<Integer>();
	for(Integer i:m.keySet())
	{
		if(m.get(i)>18)
		{
			al.add(i);
		}
	}
	System.out.println("IDs of all the eligible persons: ");
	System.out.println(al);
	}
}
