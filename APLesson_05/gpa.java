import java.util.Scanner;
public class gpa
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter grade for math:");
		String math = kb.nextLine();
		System.out.println("Enter grade for science:");
		String science = kb.nextLine();
		System.out.println("Enter grade for art:");
		String art = kb.nextLine();
		System.out.println("Enter grade for dance:");
		String dance = kb.nextLine();
		System.out.println("Enter grade for computer science:");
		String cs = kb.nextLine();
		System.out.println("Enter grade for history:");
		String history = kb.nextLine();
		System.out.println("Enter grade for english:");
		String english = kb.nextLine();
		
		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(art) + calcPoints(dance) + calcPoints(cs) + calcPoints(history) + calcPoints(english);
		 double gpa =  (gPoints / 7);
		 
		 System.out.println("Your GPA is " + gpa);
	}
	public static double calcPoints(String grade)
	{
		double points = 0.0;
		if(grade.equals("A"))
			points = 4.0;
		if(grade.equals("B"))
			points = 3.0;
		if(grade.equals("C"))
			points = 2.0;
		if(grade.equals("D"))
			points = 1.0;
		if(grade.equals("F"))
			points = 0;
		return points; 
	}
}