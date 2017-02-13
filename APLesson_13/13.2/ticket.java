public abstract class ticket
{
	private int serialNo;
	private int price;
	
	public ticket()
	{
		this.serialNo = 0;
		this.price = 0;
	}
	
	public int getserialNo()
	{
		return (int)(Math.random() * 10000000) + 1;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "serial #: " + getserialNo() + "\n " + "price: " + getPrice();
	}
}