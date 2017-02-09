import java.util.ArrayList;
import java.util.Scanner;

public class toystorerunner
{
	public static void main(String[]args)
	{
		toystore object = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(object);
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy() + "\n" + "Most Frequent Type of Toy: " + object.getMostFrequentType());
	}
}