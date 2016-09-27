import java.util.Scanner; //import Statement
public class circle
{
	static double r;
	static double area;
	public static void main(String[]args)
	{    
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		 System.out.println("radius:");
			 r = keyboard.nextDouble();
	
        calcArea();
		print();
	}
	public static void calcArea()
	{
       area = 3.14 * (r) * (r);
	}
	
		public static void print()
		{
    System.out.printf("The area of a circle with a radius of " + r + " is %.5f", area);
	}
}
