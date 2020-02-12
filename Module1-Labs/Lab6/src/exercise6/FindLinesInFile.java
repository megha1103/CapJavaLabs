package exercise6;
import java.io.IOException;
import java.util.*;

public class FindLinesInFile {

           public static void main(String args[]) throws IOException
           {
        	   
                       Scanner scr=new Scanner(System.in);
                       System.out.print("\nEnter File name: ");
                       String str=scr.nextLine();
                       FunctionClass.findLines(str);
                      scr.close();

                     
           }
}