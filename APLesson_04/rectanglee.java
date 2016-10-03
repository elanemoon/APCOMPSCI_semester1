import java.util.Scanner;
public class rectanglee
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		System.out.println("Length:");
		double l = kb.nextInt();
		System.out.println("Width:");
		double w = kb.nextInt();
        print(calcPerim(l,w));
		
	}
	public static double calcPerim(double l, double w)
	{
		return 2 * (l+w);
	}
	public static void print(double perimeter)
	{
			//print using the new perimeter value
			 System.out.printf("Your rectangle is %.5f  ft around.", perimeter);
	}
		
}
