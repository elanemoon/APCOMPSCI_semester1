import java.util.Scanner;
public class humandriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair:");
		String hair = kb.nextLine();
		System.out.println("Eyes:");
		String eyes = kb.nextLine();
		System.out.println("Skin:");
		String skin = kb.nextLine();
        human object = new human(hair, eyes, skin);
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		object.setHES("blond", "blue", "light");
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	}
}