import java.util.Scanner;
public class mphrunner
{
	
public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance:");
		int distance = kb.nextInt();
		System.out.println("Hours:");
		int hours = kb.nextInt();
		System.out.println("Minutes:");
		int minutes = kb.nextInt();
		mph object = new mph( distance, hours, minutes);
		System.out.println(object.setD() + " miles in " + object.setH() + " hours = " + object.getmph() + " mph");
	}
}