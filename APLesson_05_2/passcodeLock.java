import java.util.Scanner;

public class passcodeLock
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		chekov();
	}
	public static void chekov()
	{
		System.out.println("Enter your username:");
		String name = kb.next();
		System.out.println("Enter your password:");
		String pass = kb.next();
		if(name.equals("StephenFalken"))
		{
			if (pass.equals("joshua"))
			{
				System.out.println("Welcome back to Professor Falken.\nShall we play a game?\nHow about GLOBAL THERMONUCLEAR WAR?");
			}
			else
			{
				System.out.println("Password incorrect.");
				chekov();
			}
		}
		else if(pass.equals("joshua"))
		{
			System.out.println("Username incorrect.");
			chekov();
		}
		else
		{
			System.out.println("Username & Password incorrect.");
			chekov();
		}
	}
}