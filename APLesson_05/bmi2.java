import java.util.Scanner;
public class bmi2
{
	static double h;
	static double w;
	static double bmi;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height: ");
		h = kb.nextDouble();
		System.out.println("Please enter your weight: ");
		w = kb.nextDouble();
	    calcCondish();
		System.out.println("Your BMI is " + bmi);
	   System.out.println("You are " + condition);
	}
	public static void calcCondish()
	{
	     bmi = w / h*h;
		if(39.9 < bmi)
			condition = "Morbidly Obese";
		else if(35 < bmi)
			condition = "Very Obese";
		else if(34.9 > bmi)
			condition = "Obese";
		else if(29.9 > bmi)
			condition = "Overweight";
		else if(24.9 > bmi)
			condition = "Normal";
		else if(18.5 > bmi)
			condition = "Underweight";
	}	   
}

