import java.util.Scanner;
public class countbyx
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		System.out.println("Please enter another number:");
		int number2 = kb.nextInt();
		
		for(int i= number; i <= number2; i+= number)
		{
			System.out.print(i + " ");
		}
	}
}