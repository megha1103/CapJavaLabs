package exercise8;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args)
	{
	int[]a={1,9,8,7,8,9,5,5,7,8,9,4,5};
	HashSet<Integer> set=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}


    int n = set.size(); 
    Integer arr[] = new Integer[n]; 

    int i = 0; 
    for( Integer x : set) 
        arr[i++] = x; 

    System.out.println(Arrays.toString(arr)); 
	}
		
	
}
