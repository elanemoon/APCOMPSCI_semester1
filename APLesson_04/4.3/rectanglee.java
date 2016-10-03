import java.util.Scanner;
public class rectanglee
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		System.out.println("Length:");
		int l = kb.nextInt();
		System.out.println("Width:");
		int w = kb.nextInt();
        print(calcPerim(l,w));
		
	}
	public static int calcPerim(int l, int w)
	{
		return 2 * (l+w);
	}
	public static void print(int perimeter)
	{
			//print using the new perimeter value
			System.out.println("The perimeter of your rectangle is " + perimeter);
	}
		
}
