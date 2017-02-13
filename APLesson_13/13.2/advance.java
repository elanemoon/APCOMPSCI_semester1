public class advance extends ticket
{
	private int daysLeft;
	private int advance;
	
	public advance()
	{
		super();
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			daysLeft = 30;
		}
		else
		{
			daysLeft = 40;
		}
		return daysLeft;
	}
}