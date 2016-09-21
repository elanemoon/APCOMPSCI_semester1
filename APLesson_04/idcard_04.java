import java.util.Scanner; //import Statement
public class idcard_04
{
	public static void main(String[]args)
	{    
	
	    //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Enter your first name:");
		
		String name1 = keyboard.nextLine();
		
		
	    System.out.println("Enter your last name:");
			String name2 = keyboard.nextLine();
			
		
		 System.out.println("Enter your title:");
	      String title = keyboard.nextLine();
		 
		  System.out.println("Enter the school site:");
			String site = keyboard.nextLine();

		
		
	
		 System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		
			 
		  System.out.println("What is your subject?");
			String subject = keyboard.nextLine();
			
		
		
		 idcard_04 form = new idcard_04();
		 
		
		 System.out.print("***************************************");
	
		 
         form.format(site, year);
         form.format(name1, name2);
         form.format(title, subject);
	      
		 
		 System.out.println("\n***************************************");
		
 
		 
		
	}
	
	public void format(String item, String price)
	{
		System.out.printf("\n * %12s   %16s * ",item, price);
	}
}