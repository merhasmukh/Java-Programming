import java.util.*;
import java.io.*;

class Clock implements Runnable
{
	public void run()
	{
		while(true)
		{
			Calendar c = Calendar.getInstance();
			int hh =c.get(Calendar.HOUR);
			int mm =c.get(Calendar.MINUTE);
			int ss =c.get(Calendar.SECOND);
			System.out.println("" + hh+":" + ":" + ss);
	
			try{

				if (System.getProperty("os.name").contains("Windows"))
					new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
				else
				{
					Runtime.getRuntime().exec("clear");
					System.out.println("" +(hh < 10 ? "0" + hh : hh) + ":" + (mm < 10 ? "0" + mm : mm) + ":" +
					(ss < 10 ? "0"+ ss : ss));
					 Thread.sleep(1000);
				}
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
	}
}
			
		
		
class DigitalClk
{
	public static void main (String [] args)
	{
		//System.out.println(System.getProperty("os.name"));
		Clock c = new Clock();
		Thread t = new Thread(c);
		t.start();
		try{
			t.join();
			}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
	
	