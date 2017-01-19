import java.util.Scanner;
public class inventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Will you be entering category and price? (y/n)");
		String answer = kb.next();
		System.out.println("Please enter the item manufacturer:");
		String manufacturer = kb.next();
		System.out.println("Please enter the item name:");
		String name = kb.next();
		if(answer.equals("y")||answer.equals("Y"))
		{
			System.out.println("Please enter the category:");
			String category = kb.next();
			System.out.println("Please enter the price:");
			Double price = kb.nextDouble();
			inventory object = new inventory(manufacturer, name, category, price);
			System.out.println(object);
		}
		else if(answer.equals("n")||answer.equals("N"))
		{
			inventory object = new inventory(manufacturer, name);
			System.out.println(object);
		}
		else
			System.out.println("Error");
	}
}