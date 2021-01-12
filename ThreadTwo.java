
public class ThreadTwo extends Thread
{
	public void run ()
	{
		try
		{
			for (int i=0;i<4;i++)
			{
				Thread.sleep(2000);
				System.out.println ("Hello");
			}
		}
		catch (InterruptedException e)
		{
			System.out.println ("Thread Interrupted");
		}
	}
}
