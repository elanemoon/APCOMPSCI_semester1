public class pcclass extends gamesystem
{
    private String pcclass;
	private String device;
	public pcclass()
	{
		super();
	}
	
	public pcclass(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "\n" + "platform: " + super.getPlatform() + "\n " + "serial #: " + super.getserialNo() + "\n" + "system input: " + systemInput();
	}
}