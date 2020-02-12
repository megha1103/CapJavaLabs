package exercise9;

import java.time.LocalDate;
import java.time.Period;

public class FunctionClass {

	public static void getTimeDifference()
	{
	   LocalDate pdate = LocalDate.of(2012, 01, 01);
       LocalDate now = LocalDate.now();

       Period diff = Period.between(pdate, now);

    System.out.println(" Difference is "+   diff.getYears()+" years "+diff.getMonths()+" months and " + diff.getDays() +" days."); 
                
	}
	
}
