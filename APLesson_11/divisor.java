import java.util.Scanner;
public class divisor
{
	public static void main(String[]args)
	{    
		int[][]nums = new int [4][4];
		int num = 1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		for(int i = 0; i < nums.length; i ++)
		{
			for(int j = 0; j < nums[i].length; j ++)
			{
				nums[i][j] =(int)(Math.random()*100)+1;
				num ++;
				System.out.println(nums[i][j]);
			}
		}
		System.out.println();
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j ++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor +" in the Array.");
	}
}