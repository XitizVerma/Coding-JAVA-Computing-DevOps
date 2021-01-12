
public class ThreadThree extends Thread
{
	public void run ()
	{
		try
		{
			for (int i=0;i<4;i++)
			{
				Thread.sleep(3000);
				System.out.println ("Welcome");
			}
		}
		catch (InterruptedException e)
		{
			System.out.println ("Thread Interrupted");
		}
	}
}
