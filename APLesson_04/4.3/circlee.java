import java.util.Scanner;
public class circlee
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		System.out.println("Please enter radius");
		double r = kb.nextDouble();
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{
		return 3.14 * r * r;
	}
	public static void print(double r, double Area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f", Area);
	}
	
}