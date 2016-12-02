import java.util.Scanner;
public class reverseword
{
	public static void main(String[]args)
	{
		
		String[] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
	
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		System.out.println("in order..." );
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println();
		System.out.println("reversed...");
		reverse(names);
		
	}
		public static void reverse(String [] n)
		{
		   for(int i = n.length-1; i >= 0; i--)
		{
			System.out.println(n[i]);
		}
		}
}