public class averagenumbers
{
	public static void main(String[]args)
	{  
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) +1;
		}
		System.out.println("Numbers...");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println( "The average of the above numbers is... " + average(numbers));
	}
	public static int average(int [] numbers)
	{
		int average = 0;
		for(int number : numbers)
		{
		 return	average += number;
		}
		return average/ 10;
	}
}