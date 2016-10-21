import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int word = kb.nextInt();
		
		for(int i = word; i >= 1; i--)
		{
			System.out.println(i*i);
		}
	}
}