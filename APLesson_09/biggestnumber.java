import java.util.Scanner;
public class biggestnumber
{   
    static int [] numbers;
	static int max;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		numbers = new int[10];
		fillArray();
		System.out.println(" For the following numbers...");
		printArray();
		System.out.println( "The biggest number is " + getBiggest() );
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for(int num: numbers)
		{
			System.out.println(num);	
		}
	}
     public static int getBiggest()
	 { 
	 for(int num: numbers)
	 {
		 if(num > max)
		 {
			 max = num;
		 }
	 }
	 return max;	
	 }
}