package exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FunctionClass {
public static void getValues()
{
	HashMap<String, Integer> m = new HashMap<String, Integer>();
	  m.put("b", 8);
	  m.put("h", 4);
	  m.put("a", 2);
	  m.put("e", 6);	  
	  List<Integer> values = new ArrayList<Integer>(m.values());
	  Collections.sort(values);
	  System.out.println(values);
}
}
