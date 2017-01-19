import java.lang.Math.*;
public class distance
{
   private int xOne, yOne, xTwo, yTwo;
   private double distance;
   
   public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;	
		distance = 0;
	}
	public distance(int xo, int yo, int xt, int yt)
	{
		xOne = xo;
		yOne = yo;
		xTwo = xt;
		yTwo = yt;
		distance = 0;
	}
	
	public void setvalues(int xo, int yo, int xt, int yt)
	{
		xOne = xo;
		yOne = yo;
		xTwo = xt;
		yTwo = yt;
	}
	public double getdist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}