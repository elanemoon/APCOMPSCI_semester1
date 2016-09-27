import java.util.Scanner; //import Statement
public class cube
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{    
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		 System.out.println("Side:");
			 side = keyboard.nextDouble();
			
        calcSurf();
		print();
	}
	public static void calcSurf()
	{
       sa = 6 * (side)*(side);
	}
	
		public static void print()
		{
    System.out.printf("The surface area of a cube with " + side + " sides is %.5f", sa);
	}
}
