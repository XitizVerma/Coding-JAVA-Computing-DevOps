import java.util.Scanner;
public class EmployeeSalary 
{
	public static void main(String args[])
	{
		String name,eid;
		double bsalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name & Employee Id");
		name = sc.nextLine();
		eid = sc.nextLine();
		System.out.println("Enter Basic Salary");
		bsalary = sc.nextDouble();
		double da = (0.4)*bsalary;
		double hra = (0.2)*bsalary;
		double cca = 250;
		double pf = (0.1)*bsalary;
		double pt = 100;
		double gincome = bsalary+da+hra+cca;
		double it = (0.1)*gincome;
		double deduction = pf+pt+it;
		double nincome = gincome-deduction;
		System.out.println("The salary of employee "+name+" with Id "+eid+" is Rs."+nincome);
		sc.close();
	}
}
