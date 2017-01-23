public class inventory
{
	private String manufacturer;
	private String name;
	private String category;
	private int upc;
	private double price;
	
	public inventory()
	{
	 manufacturer = "";
	 name = "";
	 category = "";
	 upc = 0;
     price = 0;	 
	}
	public inventory(String ma, String na)
	{
	 manufacturer = ma;
	 name = na;
	 category = "Undefined";
	 price = 0;
	 upc = (int)(Math.random() * 1000000000) + 1;
	}
    public inventory(String ma, String na, String ca, double p)
    {
    manufacturer = ma;
    name = na;
    category = ca;
	price = p;
    upc = (int)(Math.random() * 1000000000) + 1;
    }
	public void setCategory(String c)
    {
	  category = c;
    }
	public void setPrice(double pr)
	{
		price = pr;
	}
   public String toString()
  {
   return "Item Info...\nManufacturer: " + manufacturer +
                           "\nName: " + name +
                           "\nCategory: " + category +
						   "\nPrice: " + price +
                           "\nupc: " + upc;
  }
}