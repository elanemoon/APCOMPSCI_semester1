import java.util.Scanner;
public class fibnaccisequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int length = kb.nextInt();
		int[] seq = new int[length];
		for(int i = 0; i < length; i++)
		{
			if(i <= 1)
			{
				seq[i] = start; 
			}
			else
			{
				seq[i] = seq[i-2] + seq[i-1];
			}
			
			System.out.println(seq[i] + " ");
		}
	}
}