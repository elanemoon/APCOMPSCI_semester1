import java.util.Scanner;
public class bmi2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height: ");
		double height = kb.nextDouble();
		System.out.println("Please enter your weight: ");
		double weight = kb.nextDouble();
		
		double bmi = weight / height*height;
		System.out.println("Your BMI is" + bmi);
		String condition = "  ";
	
		if(39.9 < bmi)
			condition = "Morbidly Obese";
		else if(35 < bmi)
			condition = "Very Obese";
		else if(34.9 >= bmi >= 29.9)
			condition = "Obese";
		else if(29.9 >= bmi >= 25)
			condition = "Overweight";
		else if(24.9 >= bmi >= 18.5)
			condition = "Normal";
		else if(18.5 >= bmi)
			condition = "Underweight";
	   System.out.println("You are" + condition);
}

}