import java.util.Scanner; 

public class BMICalc
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How nuch do you weigh (in lbs.)?");
	int weight = keyboard.nextInt();
	System.out.println("How tall are you (in inches)?");
	int height = keyboard.nextInt();
	double BMI = weight * 703 / height / height;
	System.out.println("Your BMI is " + BMI + ".");
	System.out.println("For reference: a BMI over 40 is Morbidly Obese\n" + "A BMI between 30 and 40 is Obese\n" + "A BMI between 25 and 30 is overweight\n" + "A BMI between 18.5 and 25 is normal\n" + "A BMI between 0 and 18.5 is underweight\n" + "A BMI below 0 is that of a hacker");
	System.out.println("Disclaimer: BMI is a crude measurement and does not account for muscle mass.");
	}
}