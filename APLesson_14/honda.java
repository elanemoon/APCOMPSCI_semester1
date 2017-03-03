public class honda implements locate
{
	double[] Location;
	
	public honda()
	{
		Location = new double[2];
	}
	public honda(double[] l)
	{
		Location = new double[2];
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	public double[] getLoc()
	{
		 return Location;
	}
}