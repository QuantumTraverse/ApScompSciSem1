import java.util.Scanner;

public class tableization
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Table Stuff:");
		int number = kb.nextInt();
		for(int n = number-1; n >= 1; n--)
		{
			number = number*n;
		}
		System.out.println(number);
	}
}