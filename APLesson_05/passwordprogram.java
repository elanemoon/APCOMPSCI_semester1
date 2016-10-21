import java.util.Scanner;
public class passwordprogram
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		String username = "hello";
		String password = "bye";
		System.out.println("Please enter your username.");
		String guess1 = kb.nextLine();
		System.out.println("Please enter your password.");
		String guess2 = kb.nextLine();
		if(guess1.equals(username) && guess2.equals(password))
		{	
			  System.out.println("You are granted access!");
		}
	    else if(guess1.equals(username) || guess2.equals(password))
		{
			   if(guess2.equals(password))
				  {
					  System.out.println("Your username is incorrect!");
					  passCheck();
				  }
				  else
				  {
					  System.out.println("Your password is incorrect!");
					  passCheck();
				  }
			  }
			  else
			  {
				  System.out.println("Your username and password are incorrect!");
				  passCheck();
			  }
		  
			}
}