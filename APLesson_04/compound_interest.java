import java.util.Scanner; //import Statement
public class compound_interest
{
	public static void main(String[]args)
	{    
	     compound_interest loan = new compound_interest();
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("r:");
		
		double rate = keyboard.nextDouble();
		
		
	    System.out.println("P:");
			double principal = keyboard.nextDouble();
			
		 System.out.println("n:");
	      double number = keyboard.nextDouble();
		 
		  System.out.println("t:");
			double time = keyboard.nextDouble();
		
		//method call
		System.out.println("Your total payment is " + loan.payment(rate,principal,number,time));
		System.out.println("Your total monthly payment is " + loan.total(rate,principal,number,time));
			
	}
	public double payment(double r, double p, double n, double t)
	{
		return (p)* Math.pow((1+(r/n)),n*t);
	}
	public double total(double r, double p, double n, double t)
	{
		
		return ((p)* Math.pow((1+(r/n)),n*t))/(12*t);
	}
	
}
