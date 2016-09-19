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
		String laqst = kb.next();
		System.out.println("Please enter your title:");
		String item2 = kb.next();
		System.out.println("Please enter the school site:");
		String price2 = kb.next();
		System.out.println("Please enter the school year:");
		String item3 = kb.next();
		System.out.println("Please enter your subject:");
		String price3 = kb.next();
		
		System.out.println("************************************");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n************************************");
		System.out.println("* Thanks for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*%10s ************** %4.2f", word, number);
	}
	
}