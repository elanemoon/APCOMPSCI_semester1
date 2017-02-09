public class bill extends money
{

	private String face;

	
	public bill()
	{
	    super();
		face = "";

	}
	public bill(String n, String f, double v)
	{
	    super(n, v);
		face = f;
	
	}
	public String scan()
	{
		return face;
	}
	public String toString()
	{
		return "face: " + face + "\n" +
		       super.toString();
	}
}