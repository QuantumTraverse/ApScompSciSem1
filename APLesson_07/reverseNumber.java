import java.util.Scanner;
public class reverseNumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		int number = kb.nextInt();
		System.out.println("The reversion of " + number + " is " + reverser(number) + ".");
	}
	public static int reverser(int num)
	{
		int rev = 0;
		while(num>0)
		{
			rev = rev*10;
			rev += (num%10);
			num = num/10;
		}
		return rev;
	}
}