import java.util.Scanner;
public class center
{
		static String word1;
		static String word2;
		static String word3;
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter your first word: ");
	   word1 = kb.nextLine();
	   System.out.println("Please enter your second word: ");
	   word2 = kb.nextLine();
	   System.out.println("Please enter your third word: ");
	   word3 = kb.nextLine();
	   System.out.println(makeCenter(word1));
	   System.out.println(makeCenter(word2));
	   System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String word1)
	{
		if(word1.length() >= 20)
		{
			return word1;
		}
		else
			return makeCenter(" " + word1 + " ");
	}
}