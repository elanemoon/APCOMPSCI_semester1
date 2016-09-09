import java.util.Scanner; //import Statement

public class bmi
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your height in meters?");
		
		double meters = keyboard.nextDouble();
		System.out.println("Ok.");
		
		System.out.println("What is your weight in kg?");
		
		double kg = keyboard.nextDouble();
		System.out.println("Ok.");
		
		double BMI =  kg /( meters * meters);
		System.out.println(BMI);
	}
	    
}