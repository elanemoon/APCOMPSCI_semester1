import java.util.Random;
public class dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(5)+1;
		System.out.println("You rolled a " + player);
		int computer = rand.nextInt(5)+1;
		System.out.println("Computer rolled a " + computer);
		String winner = rollDice(player, computer);
		System.out.println("The winner is " + winner);
	
		
	
		}
	
	public static String rollDice(int p, int c)
	{
		String winner = " ";
		if(p > c)
		{
			winner = "player";
		}
		if(p < c)
		{
			winner = "computer";
		}
		return winner;
	}
}