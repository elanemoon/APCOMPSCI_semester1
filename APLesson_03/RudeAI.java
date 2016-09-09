import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		System.out.println("Eww..." + name + " is a weird name.");
		
		System.out.println("How old are you?");
		
		String old = keyboard.next();
		System.out.println("You're old!");
		
	    System.out.println("What do you do for fun?");
		
		String dances = keyboard.next();
		System.out.println("Who dances for fun?");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		System.out.println("I don't like " + music);
		
		System.out.println("How many siblings do you have?");
		
		String sibling = keyboard.next();
		System.out.println("I feel bad for your sibling.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String grow = keyboard.next();
		System.out.println("How can you not know what you want to do with your life?");
		
		System.out.println("you're " + name + " and " + old + "." + " You like " + dances + " and listen to " + music + "." + " Good luck with your life.");
		
	}
	    
}