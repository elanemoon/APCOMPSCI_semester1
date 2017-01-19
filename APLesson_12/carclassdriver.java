import java.util.Scanner;
public class carclassdriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Paint:");
		String paint = kb.nextLine();
		System.out.println("Interior:");
		String interior = kb.nextLine();
		System.out.println("Engine:");
		String engine = kb.nextLine();
		System.out.println("Tires:");
		String tire = kb.nextLine();
	    carclass object = new carclass(paint, interior, engine, tire);
		System.out.println("Your vehicle is ready...." + "\n" + "Paint:" + object.getPaint() + "\n" + "Interior:" + object.getInterior()+ "\n" + "Engine:" + object.getEngine() + "\n" + "Tires:" + object.getTires());
	}
}