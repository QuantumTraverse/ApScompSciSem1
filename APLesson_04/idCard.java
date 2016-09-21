import java.util.Scanner; 

public class idCard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		idCard form = new idCard();
		
		System.out.println("Please enter your first name:");
		String first = kb.next();
		System.out.println("Please enter your last name:");
		String last = kb.next();
		System.out.println("Please enter your title:");
		String title = kb.next();
		System.out.println("Please enter the school site:");
		String site = kb.next();
		System.out.println("Please enter the school year:");
		String year = kb.next();
		System.out.println("Please enter your subject:");
		String subject = kb.next();
		
		System.out.println("*************************");
		form.format(site, year);
		form.format(first, last);
		form.format(title, subject);
		System.out.println("*************************");
	}
	
	public void format(String word, String other)
	{
		System.out.printf("*%10s %12s*\n", word, other);
	}
	
}