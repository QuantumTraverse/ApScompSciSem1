import java.util.Scanner;

public class byXCount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your integer:");
		int integer = kb.nextInt();
		System.out.println("Please enter your factor:");
		int factor = kb.nextInt();
		for(int l = 0; l <= integer; l+=factor)
		{
			System.out.print(l+ "\t");
		}
	}
}