
import java.util.Scanner;
public class MidString 
{
	public static void main (String args[])
	{
		String s;
		int len,mid;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a String");
		s = sc.nextLine();
		len = s.length();
		mid = len/2;
		if (len%2 != 0)
			System.out.println ("Middle Character is "+s.charAt(mid));
		else
			System.out.println ("Middle Character are "+s.charAt(mid-1)+" & "+s.charAt(mid));
	}
}
