public class car implements locate
{
	double[] location;
	public int ID;
	
	public car()
	{
		location = new double[2];
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public double[] getLoc()
	{
		 return location;
	}
}