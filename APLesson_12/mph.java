import static java.lang.Math.*;
public class mph
{
	private int distance, hours, minutes;
	private double mph;

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
	public int setD()
	{
		return distance;
	}
	public int setH()
	{
	    return hours;
	}
	public int setM()
	{
		return minutes;
	}
	public void setMPH(double mph)
	{
		mph = 0;
	}
	public double getmph()
	{
		mph = Math.round(distance /(hours + minutes / 60.0));
		return mph;
	}
}