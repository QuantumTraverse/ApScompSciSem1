import java.util.Scanner;
import java.util.Random;

public class superReceipt
{
	static double subtotal;
	static double taxationistheft;
	static double total;
	static String thereisnoSuchThingasaFreeLunch;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		superReceipt form = new superReceipt();
		
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter its price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter its price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter its price:");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4:");
		String item4 = kb.next();
		System.out.println("Please enter its price:");
		double price4 = kb.nextDouble();
		
		subtotal = price1+price2+price3+price4;
		taxationistheft = 0.08 * subtotal;
		total = taxationistheft+subtotal;
		
		System.out.println("-=-=-=-=-=-=-=-=-Receipt-=-=-=-=-=-=-=-=-");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		System.out.println("");
		form.format("Subtotal", subtotal);
		form.format("Tax", taxationistheft);
		discount();
		System.out.printf("\n*%10s ******************** %6.2s%%", "Discount", thereisnoSuchThingasaFreeLunch);
		form.format("Total", total);
		System.out.println("\n----------------------------------------");
		System.out.println("* Thanks for your support (Not Really) *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*%10s ******************** %4.2f", word, number);
	}
	
	public static void discount()
	{
		if(total >= 2000)
		{
			total = 0.85*total;
			thereisnoSuchThingasaFreeLunch = "15";
		}
		else
		{
			thereisnoSuchThingasaFreeLunch = "0";
		}
	}
}