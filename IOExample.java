import java.io.*;

public class IOExample 
{
	public static void main (String args[]) throws IOException, FileNotFoundException
	{
		char c;
		int i;
		FileInputStream fin = new FileInputStream ("/Users/gautamkumar/eclipse-workspace/Lab Programs/src/Test.txt"); //Set path of Test.txt
		FileOutputStream fout = new FileOutputStream ("/Users/gautamkumar/eclipse-workspace/Lab Programs/src/Test.txt"); //Set path of Test.txt
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the characters: q to quit");
		
		do {
			c = (char)br.read();
			if (c != 'q')
				fout.write(c);
		} while (c != 'q');
		
		do {
			i = fin.read();
			if (i != -1)
				System.out.print ((char)i);
		} while (i != -1);
		fin.close();
		fout.close();
	}
}
