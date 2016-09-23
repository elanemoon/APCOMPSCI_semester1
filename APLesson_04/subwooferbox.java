import java.util.Scanner; //import Statement
public class subwooferbox
{
	public static void main(String[]args)
	{    
	     subwooferbox box = new subwooferbox();
	     //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("height:");
		
		double height = keyboard.nextDouble();
		
		
	    System.out.println("length:");
			double length = keyboard.nextDouble();
			
		 System.out.println("width:");
	      double width = keyboard.nextDouble();
		
		//method call
		System.out.println("Your volume in cubic inches is " + box.calcVol(height,length,width));
		System.out.println("Your volume in cubic feet is " + box.feet(height,length,width));
	}
	public double calcVol(double height, double length, double width)
	{
		return (height)*(length)*(width);
	}
	public double feet(double height, double length, double width)
	{
		
		return ((height)*(length)*(width))/1728;
	}
	
}
