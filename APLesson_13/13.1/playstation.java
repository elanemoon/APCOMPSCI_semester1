public class playstation extends console
{
	private String playstation;
	
	public playstation()
	{
		super();
	}
	
	public playstation(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}