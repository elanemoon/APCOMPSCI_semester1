public class carclass
{
	private String paint, interior, engine, tire;
	
	public carclass()
	{
		carclass car1 = new carclass("red","leather","sports","large");
	}

	public carclass(String p,String i, String e, String t)
	{
	 paint = p;
	 interior = i;
	 engine = e;
	 tire = t;	
	}
    public void setCustom(String p, String i,String e,String t)
    {
		paint = p;
		interior = i;
		engine = e;
		tire = t;
	}
	 
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tire;
	}
}