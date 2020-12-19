
class Cone extends Solid 
{
	void SArea()
	{
		double sarea = 3.14*r*(r+Math.sqrt(r*r+h*h));
		System.out.println ("Surface Area of Cone = "+sarea);
	}
	void Vol()
	{
		double vol = (3.14*r*r*h)/3;
		System.out.println ("Volume of Cone = "+vol+"\n");
	}
}