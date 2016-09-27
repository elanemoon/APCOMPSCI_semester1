import java.util.Scanner; //import Statement
public class average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	public static void main(String[]args)
	{    
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		 System.out.println("Number 1:");
			 num1 = keyboard.nextDouble();
			
		 System.out.println("Number 2:");
	         num2 = keyboard.nextDouble();
					
		 System.out.println("Number 3:");
	         num3 = keyboard.nextDouble();
        calcAverage();
		print();
	}
	public static void calcAverage()
	{
       average = (num1 + num2 + num3)/3;
	}
	
		public static void print()
		{
    System.out.printf("The average of " + num1 + "," + num2 + ",and " + num3 + " is %.5f", average);
	}
}
