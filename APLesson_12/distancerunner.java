import java.util.Scanner;
public class distancerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("x1:");
		int xo = kb.nextInt();
		System.out.println("y1:");
		int yo = kb.nextInt();
		System.out.println("x2:");
		int xt = kb.nextInt();
		System.out.println("y2:");
		int yt = kb.nextInt();
		distance object = new distance( xo, yo, xt, yt);
		System.out.println("distance = " + object.getdist());
		object.setvalues(1,2,3,4);
		System.out.println("distance = " + object.getdist());
	}

}