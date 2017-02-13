public abstract class console extends gamesystem
{
	private String console;
	
	public console()
	{
		super();
	}
	
	public console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "platform: " + super.getPlatform() + "\n " + "serial #: " + super.getserialNo() + "\n" + "controller: " + getController() + "\n";
	}
}