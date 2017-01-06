import java.util.Scanner;
public class gamegun
{
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String [] clip;
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = String[];
		String.length = clipsize;
		resetClip();
		while(bulletCount >= 0 || shotCount >= 0)
		{
		Scanner kb = new Scanner(System.in);
		System.out.println("Action:");
		String action = kb.nextLine();
		if(action == "R")
			reload();
		if(action == "S")
			System.out.println(shoot());
		}
		System.out.println(printClip());	
		System.out.println("Out of Bullets!!!");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip[i].length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
		   shotCount -= 1;
		   return "Boom!!!";
		}
		   else
			   return "Reload!!!";
			   
	}
	public static void reload()
	{
		if(bulletCount >= clipsize)
		{
			bulletCount -= clipsize;
		    shotCount = clipsize;
		}
		else
			shotCount = bulletCount;
		    bulletCount = 0;
	}
	 resetClip();
	   for(int i = 0; i < shotCount; i ++)
		   clip[i] = " * ";
	public static void printClip()
	{
		String output = " ";
		System.out.println("Bullets: " + \t bulletCount + \n "Clip: " \t);
		for(int i = 0; i < clipsize; i ++)
			clip[i] += output;
	}
	print output;
}