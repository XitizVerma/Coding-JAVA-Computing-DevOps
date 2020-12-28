
class Cylinder extends Solid 
{
	void SArea()
	{
		double sarea = (2*3.14*r*h) + (2*3.14*r*r);
		System.out.println ("Surface Area of Cylinder = "+sarea);
	}
	void Vol()
	{
		double vol = 3.14*r*r*h;
		System.out.println ("Volume of Cylinder = "+vol+"\n");
	}
}
