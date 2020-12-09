
class CanaraBank implements Bank 
{
	String name;
	double principal;
	double period;
	double interest;
	double roi = 8.5;
	
	public void getDetails ()
	{
		System.out.println ("Enter Name");
		name = sc.next();
		System.out.println ("Enter Principal");
		principal = sc.nextDouble();
		System.out.println ("Enter Period");
		period = sc.nextDouble();
	}
	
	public void calculateInterest ()
	{
		interest = (principal * period * roi)/100;
	}
	
	public void getMAmount ()
	{
		double mAmount = principal + interest;
		System.out.println (name+" your Maturity Amount in Canara Bank is Rs. "+mAmount+"\n");
	}
}

