import java.util.Scanner;
public class treedegsixty
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String word = kb.nextLine();
	   int stop = word.length();
	   int start = 1;
	   tree(word, stop, start);

	}
	public static void tree(String word, int stop, int start)
	{
		if(start <= stop)
		{
			System.out.printf("%10s \n", word.substring(0, start));
		   start += 1;
		   tree(word, stop, start);
		}
         
	}
}