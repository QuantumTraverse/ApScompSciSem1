import java.util.Scanner;
public class luckySevens
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		int number = kb.nextInt();
		System.out.println("There are " + luckmaster(number) + " seven(s) in your number.");
	}
	public static int luckmaster(int num)
	{
		if (num > 0)
		{
			if (num%10 == 7)
				return 1 + luckmaster(num/10);
			else
				return 0 + luckmaster(num/10);
		}
		else
			 return 0;
	}
}