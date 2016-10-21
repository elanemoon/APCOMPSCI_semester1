import java.util.Scanner;
public class adventuree
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
		                         "\n 1. Enter the house of Gryffindor" +
								 "\n 2. Enter the house of Slytherin " );
		int GorS = kb.nextInt();
		if(GorS == 1)
		{
			System.out.println("You decided to explore Hogwarts. What would you do?" +
			                          "\n 1. Visit Hagrid" +
									   "\n 2. Try out for the Quidditch team" +
									   "\n 3. Befriend Harry Potter" );
			int Gan = kb.nextInt();
             if( Gan == 1)	
			 {
				  System.out.println("He offers you horrible tea. Do you..." +
				                       "\n 1. Drink it." +
									   "\n 2. Rudely shove it away." +
									   "\n 3. Politely decline it.");
			      int GA = kb.nextInt();
               if( GA == 1)
			   {
				    System.out.println("It tastes horrible, but Hagrid is happy and he gives you a gift. You decide to head back to the dorm to play with your gift and you end your adventure.");
					int GAA = kb.nextInt();	
			   }
			   else
				    System.out.println("Hagrid is a bad mood since you rejected his tea and you are forced to return back to the castle.");
			 }
				else
				{
					 System.out.println("You end up catching a cold so you are forced to stay inside your dorm. But Harry Potter finds you inside the dorm and asks you to help him return an illegal dragon egg. Do you" +
			                                                                    "1. Accept his invite." +
																				 "2. Decline his invite.");
					int SA = kb.nextInt();
                  if ( SA == 1)
					  System.out.println("You help him return the egg and you become good friends with him. From there on out, Harry Potter invites you to all his adventures throughout Hogwarts.");
				  else
					  System.out.println("You stay in your dorm and you are unable to participate in an adventure.");
				  
				}
			 
		}
		else
		{
			System.out.println("You are approached by Malfoy to join his crew. Do you accept?"+
			                                      "\n 1. Yes" +
												  "\n 2. No");
				int MA = kb.nextInt();
                   if( MA == 1)
				   {
					    System.out.println("You join their hooligan crew. They have a plan to sabatoge the Gryfinndor Quidditch team. Do you join them?" +
					                                  "\n 1. Yes" +
				   					  "\n 2. No"     );
									  int HA = kb.nextInt();
	              if (HA == 1)
				  {					
			  System.out.println(" You get expelled for getting caught in trying to poison the Hufflepuff house.");
				  }
				else
					   System.out.println("You manage to stay out of trouble throughout the rest of your time at Hogwarts. You successfully graduate from Hogwarts and work at the Ministry of Magic");
				   }
				   else
					    System.out.println("You are able to stay away from trouble, but another Slytherin approaches you to engage in malicious activity. Do you accept?" +
					                                   "\n 1. Yes" +
												  "\n 2. No"   );
						 int TA = kb.nextInt();
                        if( TA == 1)
						{
                            System.out.println(" You get expelled for getting caught in trying to poison the Hufflepuff house.");
						}
							else
                               System.out.println("You manage to stay out of trouble throughout the rest of your time at Hogwarts. You successfully graduate from Hogwarts and work at the Ministry of Magic");
		}
	}
}