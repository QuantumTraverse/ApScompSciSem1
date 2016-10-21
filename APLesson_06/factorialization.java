import java.util.Scanner;

public class factorialization
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		int number = kb.nextInt();
		for(int n = number-1; n >= 1; n--)
		{
			number = number*n;
		}
		System.out.println(number);
	}
}