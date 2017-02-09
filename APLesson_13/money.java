public abstract class money
{
	private String name;
	private double value;
	private int count;
	
	public money()
	{
		this.name = "";
		this.value = 0;
		this.count = 0;
	}
	public money(String n, double v)
	{
		this.name = n;
		this.value = v;
		this.count = 0;
	}
	public abstract String scan();

	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name; 
	}
	public double getAValue()
	{
		return value;
	}
	public int getCount()
	{
		return count;
	}
	public String toString()
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}