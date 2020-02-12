package exercise2;

import java.util.HashMap;

public class FunctionClass {
public static void countCharacter()
{
	char[]a={'a','r','a','m','j','m','m','a','m','r'};
	HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
    for (char c : a)
    {
        if(mp.containsKey(c))
        {

            mp.put(c, mp.get(c)+1);
        }
        else
        {
           mp.put(c, 1);
        }
    }
		
    System.out.println(mp);
}
}
