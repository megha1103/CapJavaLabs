package exercise1;
import java.io.*;

public class CopyDataThread extends Thread{
	    
		public static void main(String args[]) throws FileNotFoundException,IOException 
			    {
		
			//  final long timeInterval = 2000000;

			  Runnable runnable = new Runnable() {
              int x=10;
                 public void run() {

              	
                	  
                	   
                	          System.out.println(x+" Copied");
                              x+=10;

  
                	    
                 }
                	  };

			

			       
			        FileInputStream fin = new FileInputStream("abc"); 
			  	      
			        FileOutputStream fout = new FileOutputStream("output"); 
			  
			        int b; 
			        int c=0;
			 
			        while  ((b=fin.read()) != -1) 
			        {
			            fout.write(b);
			            c++;
			        if(c%10==0)
			        {
			        
			        	  Thread thread = new Thread(runnable);
			              try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						  thread.start();		        	  
			        
			        }
			        }

			        fin.close(); 
			        fout.close(); 
			    } 
	}
	


