public class studentadvance extends advance
{
	private int daysLeft;
	private String studentadvance;
	
	public studentadvance()
	{
		super();
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			daysLeft = 15;
		}
		else
		{
			daysLeft = 20;
		}
		return daysLeft;
	}
	
	public String toString()
	{
		return "serial #: " + getserialNo() + "\n " + "price: " + getPrice() + "\n" + "STUDENT ID REQUIRED";
	}
}