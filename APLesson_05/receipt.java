import java.util.Scanner; //import Statement

public class receipt
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Enter item 1");
		String item1 = keyboard.next();
		
		System.out.println("Enter price");
		double price1 = keyboard.nextDouble();
		
	    System.out.println("Enter item 2");
		String item2 = keyboard.next();
		
		keyboard.nextLine();
		
		System.out.println("Enter price");
		double price2 = keyboard.nextDouble();
		
			System.out.println("Enter item 3");
		String item3 = keyboard.next();
		
		keyboard.nextLine();
		
		System.out.println("Enter price");
		double price3 = keyboard.nextDouble();
		
	    System.out.println("Enter item 4");
		String item4 = keyboard.next();
		
		keyboard.nextLine();
		
		System.out.println("Enter price");
		double price4 = keyboard.nextDouble();
		
		receipt form = new receipt();
		
		 
		 
		 double subtotal = price1 + price2 + price3 + price4;
		 
		 
		 double tax = 0.08 * subtotal;
		 
		 
		 double discount = discount(subtotal);
		 
		 
		 double totals = subtotal - (discount + tax);
		 
		 System.out.println("<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
	
		 
         form.format(item1, price1);
         form.format(item2,price2);
         form.format(item3, price3);
		 form.format(item4, price4);
		 form.format("Subtotal", subtotal);
		 form.format("Tax", tax);
		 form.format("Discount",discount);
		 form.format("Total", totals);
		 
		 System.out.println("\n___________________________________________");
		 System.out.println("  *  Thank you for your support  *  ");
 

		
	}
	public static double discount(double subtotal)
	{
		double discount = 0;
		if(subtotal >= 2000)
		{
			discount = .15 * subtotal;
		}
		if(subtotal <= 2000) 
		{
			discount = 0;
		}
		return discount;
	}
	
	public void format(String item,double price)
	{
		System.out.printf("\n * %10s   . . . . . . . %10.2f",item, price);
	}
}	