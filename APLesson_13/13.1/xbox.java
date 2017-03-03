public class xbox extends console
{

	private String xbox;
	
	public xbox()
	{
		super();
	}
	
	public xbox(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
}