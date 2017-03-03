public class toyota implements locate
{
	double[] Location;
	
	public toyota()
	{
		Location = new double[2];
	}
	
	public toyota(String l)
	{
		Location = new double[2];
		String[] locs = l.split(", ");
		Location[0] = Double.parseDouble(locs[0]);
		Location[1] = Double.parseDouble(locs[1]);
	}
	
	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public double[] getLoc()
	{
		 return Location;
	}
}
