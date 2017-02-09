public class coin extends money
{
	private String name, weight;
	private double value;
	public coin()
	{
		super();
		this.weight = "";
	}
	public coin(String n, String w, double v)
	{
		super(n, v);
		this.face = f;
		
	}
	public String scan()
	{
		return weight;
	}
	public String toString()
	{
		return "Weight: " + weight + "g\n" +
		        super.toString();
	}
}