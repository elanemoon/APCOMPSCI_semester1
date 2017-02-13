public abstract class gamesystem
{
	private String platform;
	private int serialNo;
	
	public gamesystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	public gamesystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
}