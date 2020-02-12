package exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@SuppressWarnings({ "unchecked", "rawtypes" })
public class FunctionClass {
public static void getSecondSmallest(Integer a[])
{
	List al = Arrays.asList(a); 
    
    Collections.sort(al);

System.out.println("Second Smallest: "+al.get(1));
}
}
