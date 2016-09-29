import java.util.Scanner; //import Statement

public class bmi
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your height in inches?");
		
		double inches = keyboard.nextDouble();
		System.out.println("Ok.");
		
		System.out.println("What is your weight in lb?");
		
		double lb = keyboard.nextDouble();
		System.out.println("Ok.");
		
		double BMI =  lb /( inches * inches);
		System.out.println(BMI);
	}
	    
}