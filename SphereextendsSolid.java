
class Sphere extends Solid 
{
	void SArea()
	{
		double sarea = 4*3.14*r*r;
		System.out.println ("Surface Area of Sphere = "+sarea);
	}
	void Vol()
	{
		double vol = (4/3)*3.14*r*r*r;
		System.out.println ("Volume of Sphere = "+vol+"\n");
	}
}
