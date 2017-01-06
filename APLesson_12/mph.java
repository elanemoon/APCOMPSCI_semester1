import static java.lang.Math.*;
public class mph
{
	int distance, hours, minutes;
	double mph;

	public mph()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;	
	}
	public mph(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	public void setD(int d)
	{
		distance = d;
	}
	public void setH(int h)
	{
		hours = h;
	}
	public void setM(int m)
	{
		minutes = m;
	}
	public void setMPH(double mph)
	{
		mph = 0;
	}
	public double miles()
	{
		mph = Math.round(distance /(hours + minutes / 60.0));
		return mph;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance:");
		distance = kb.nextInt();
		System.out.println("Hours:");
		hours = kb.nextInt();
		System.out.println("Minutes:");
		minutes = kb.nextInt();
		mph object = new mph(int distance, int hours, int minutes);
		System.out.println(object.setD() + " miles in " + object.setH() + " hours = " + miles + " mph");
		
		mph object1 = new mph();
		System.out.println(object1.setD() + " miles in " + object1.setH() + " hours = " + miles + " mph");
	
	}
}