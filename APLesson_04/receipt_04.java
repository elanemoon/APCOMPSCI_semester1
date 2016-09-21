import java.util.Scanner; //import Statement
public class receipt_04
{
	public static void main(String[]args)
	{    
	
	    //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Please enter item 1:");
		
		String item1 = keyboard.nextLine();
		
		
	    System.out.println("Please enter the price:");
			double price1 = keyboard.nextDouble();
			
		
		keyboard.nextLine();
		 System.out.println("Please enter item 2:");
	      String item2 = keyboard.nextLine();
		 
		  System.out.println("Please enter the price:");
			double price2 = keyboard.nextDouble();

			keyboard.nextLine();
		
		
		
		 System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
			 
		  System.out.println("Please enter the price:");
			double price3 = keyboard.nextDouble();
			
		
		
		 receipt_04 form = new receipt_04();
		 
		 String sub = " Subtotal:";
		 double subtotal = price1 + price2 + price3;
		 
		 String word = "Tax:";
		 double tax = subtotal*(0.07);
		 
		 String file = "Total:";
		 double total = subtotal + tax;
		
		 System.out.println("<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
	
		 
         form.format(item1, price1);
         form.format(item2,price2);
         form.format(item3, price3);
		 form.format(sub, subtotal);
		 form.format(word, tax);
		 form.format(file, total);
		 
		 System.out.println("\n___________________________________________");
		 System.out.println("  *  Thank you for your support  *  ");
 
		 
		
	}
	
	public void format(String item,double price)
	{
		System.out.printf("\n * %10s   . . . . . . . %10.2f",item, price);
	}
}