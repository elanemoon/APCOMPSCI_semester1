public class gmc implements locate
{
	private double corx;
	private double cory;
	
	public gmc()
	{
		corx = 0;
		cory = 0;
	}
	
	public gmc( double x, double y)
	{
		corx = x;
		cory = y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double corx, double cory)
	{
	   	this.corx = corx;
		this.cory = cory;
	}
	
	public double[] getLoc()
	{
		 double[] locate = new double[2];
		 locate[0] = corx;
		 locate[1] = cory;
		 return locate;
	}
}