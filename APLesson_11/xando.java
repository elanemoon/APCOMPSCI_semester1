public class xando
{
	public static void main(String[]args)
	{
		String [][] xAndo = new String [4][4];
		int spot = 0;
		for(int i = 0; i < xAndo.length; i ++)
		{
			for(int j = 0; j < xAndo[i].length; j ++)
			{
				int pick =(int)(Math.random()*2)+1;
			    spot ++;
				if(pick == 1)
				{
					xAndo[i][j] = "x";
				}
				else
					xAndo[i][j] = "o";
				System.out.println(xAndo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}