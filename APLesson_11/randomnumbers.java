public class randomnumbers
{
	public static void main(String[]args)
	{
		int[][]values = new int [4][4];
		int num = 1;
		for(int i = 0; i < values.length; i ++)
		{
			for(int j = 0; j < values[i].length; j ++)
			{
				values[i][j] =(int)(Math.random()*100)+1;
				num ++;
			}
		}
		for(int i = 0; i < values.length; i ++)
		{
			for(int j = 0; j < values[i].length; j ++)
			{
				System.out.println(values[i][j] + "\t");
			}
			System.out.println();
		}
	}
}