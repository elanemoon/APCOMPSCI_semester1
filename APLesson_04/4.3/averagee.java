import java.util.Scanner;
public class averagee
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		System.out.println("Enter number 1");
		double num1 = kb.nextDouble();
		System.out.println("Enter number 2");
		double num2 = kb.nextDouble();
		System.out.println("Enter number 3");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, calcAverage(num1, num2, num3));
		
		
	}
	public static double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2+ num3)/3;
	}
	public static void print(double num1, double num2, double num3, double average)
	{
		 System.out.printf("The average of " + num1 + "," + num2 + ", and " + num3 + " is %.5f", average);
	}	
	
}