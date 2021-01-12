
public class ThreadOne extends Thread
{
	public void run ()
	{
		try
		{
			for (int i=0;i<4;i++)
			{
				Thread.sleep(1000);
				System.out.println ("Good Morning");
			}
		}
		catch (InterruptedException e)
		{
			System.out.println ("Thread Interrupted");
		}
	}
}
