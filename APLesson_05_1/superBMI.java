import java.util.Scanner;

public class superBMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How much do you weigh (in lbs.)?");
		int weight = kb.nextInt();
		System.out.println("How tall are you (in inches)?");
		int height = kb.nextInt();
		double BMI = weight * 703.0 / height / height;
		System.out.printf("Your BMI is: %.3f.\n", BMI);
		System.out.println("You are " + condition(BMI) + ".");
		System.out.println("Disclaimer: BMI is a crude measurement and does not account for muscle mass.");
	}
	public static String condition(double bmi)
	{
		if(bmi >= 40.0)
			return "morbidly obese";
		else if(bmi > 35)
			return "very obese";
		else if(bmi > 30)
			return "obese";
		else if(bmi > 25)
			return "overweight";
		else if(bmi > 18.5)
			return "normal";
		else if(bmi > 15)
			return "underweight";
		else if(bmi > 0)
			return "anorexic";
			//https://en.wikipedia.org/wiki/Anorexia_nervosa
		else
		{
			System.out.println("*cough* Hacker! *cough*");
			return "a hacker";
		}
	}
}