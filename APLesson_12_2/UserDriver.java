import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to use a public avatar? (y/n)");
		String answer = kb.next();
		System.out.println("Please enter the first name:");
		String fName = kb.next();
		System.out.println("Please enter the last name:");
		String lName = kb.next();
		if(answer.equals("y")||answer.equals("Y"))
		{
			System.out.println("Please enter the avatar:");
			String avatar = kb.next();
			User object = new User(fName, lName, avatar);
			System.out.println(object);
		}
		else if(answer.equals("n")||answer.equals("N"))
		{
			User object = new User(fName, lName);
			System.out.println(object);
		}
		else
			System.out.println("Error");
	}
}