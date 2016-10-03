import java.util.Scanner; 

public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double num1 = kb.nextDouble();
		System.out.println("Please enter the second number:");
		double num2 = kb.nextDouble();
		System.out.println("Please enter the last number:");
		double num3 = kb.nextDouble();
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f.", num1, num2, num3, calc(num1, num2, num3));
	}
	
	public static double calc(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3.0;
	}
	
}