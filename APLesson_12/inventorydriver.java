import java.util.Scanner;
public class inventorydriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
        inventory object;
		System.out.println("manufacturer");
        String manu = kb.next();
        System.out.println("name");
        String nam = kb.next();
        System.out.println("will you enter category and price information (y or n)");
        String answer = kb.next();
		if(answer.equals("n"))
		{
			object = new inventory(manu, nam);
			System.out.println(object);
		}
		else
			{
              System.out.println("please enter category");
              String category = kb.next();
			  System.out.println("please enter price");
              double price = kb.nextDouble();
			  object = new inventory(manu, nam, category, price);
			  System.out.println(object);
            }
	}
}