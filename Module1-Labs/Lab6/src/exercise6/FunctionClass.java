package exercise6;

import java.io.FileInputStream;
import java.io.IOException;

public class FunctionClass {
	public static void findLines(String str)	throws IOException
	{

        int nl=1,nw=0;           
        char ch;
		FileInputStream f=new FileInputStream(str);
        int n=f.available();
        for(int i=0;i<n;i++)
        {
                    ch=(char)f.read();
                    if(ch=='\n')
                    nl++;
                    else if(ch==' ')
                                nw++;
                                                       
        }
        System.out.println("\nNumber of lines : "+nl);
        System.out.println("\nNumber of words : "+(nl+nw));
        System.out.println("\nNumber of characters : "+n);
        f.close();
		
	}
}


