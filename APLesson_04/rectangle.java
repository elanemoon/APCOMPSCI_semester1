import java.util.Scanner; //import Statement
public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	public static void main(String[]args)
	{    
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		 System.out.println("length:");
			 l = keyboard.nextDouble();
			
		 System.out.println("width:");
	         w = keyboard.nextDouble();
		
        calcPerim();
		print();
	}
	public static void calcPerim()
	{
       perimeter = (2*(l)) + (2*(w));
	}
	
		public static void print()
		{
    System.out.printf("Your rectangle is %.5f  ft around.", perimeter);
	}
}
