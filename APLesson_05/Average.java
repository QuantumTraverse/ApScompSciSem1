import java.util.Scanner; 

public class Average
{
	static double num1;
	static double num2;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num1 = kb.nextDouble();
		System.out.println("Please enter the other number:");
		num2 = kb.nextDouble();
		calc();
		print();
	}
	
	public static void calc()
	{
		avg = (num1+num2)/2.0;
	}
	
	public static void print()
	{
		System.out.println("Your perimter is " + avg + " ft around.");
	}
	
}