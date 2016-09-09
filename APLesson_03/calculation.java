import java.util.Scanner; //import Statement

public class calculation
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Give me a number.");
		
		double number = keyboard.nextDouble();
		System.out.println("Ok.");
		
		System.out.println("Give me another number.");
		
		double another = keyboard.nextDouble();
		System.out.println("Ok.");
		
		double Product = number * another;
		System.out.println(Product);
	}
	    
}