public class human
{
	private String hair, eyes, skin;
	public human()
	{
		human human1 = new human("brown","blue","white");
	}
	public human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin =s;
	}
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}

	
}