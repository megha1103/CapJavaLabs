package exercise2;
import java.util.*;

public class Timer  extends Object {
	 public static void main(String[] args) {
		// creating timer task, timer
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
		    @Override
		    public void run() {
		       for(int i=1; i<=10;i++)
		        {
		        System.out.println("Task Timer on Fixed Rate");
		        }
		    };
		};
		t.scheduleAtFixedRate(tt,500,1000);  
		   }
		}

      