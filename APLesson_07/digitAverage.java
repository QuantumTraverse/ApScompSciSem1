import java.util.Scanner;
public class digitAverage
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		int number = kb.nextInt();
		System.out.println("The average of the digits in " + number + " is " + aveDigits(number) + ".");
	}
	public static int aveDigits(int num)
	{
		int sum = 0;
		int runtime = 0;
		while(num>0)
		{
			sum += (num%10);
			num = num/10;
			runtime++;
		}
		return sum/runtime;
	}
}