import java.util.Scanner;
abstract class Solid
{
	double r;
	double h;
	abstract void SArea();
	abstract void Vol();
	
	void input ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Radius");
		r = sc.nextDouble();
		System.out.println("Enter the Height");
		h = sc.nextDouble();
	}
}
