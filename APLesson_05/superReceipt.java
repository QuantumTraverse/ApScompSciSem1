import java.util.Scanner;
import java.util.Random;

public class superReceipt
{
	static double subtotal;
	static double secondsubtotal;
	static double taxationistheft;
	static double total;
	static String thereisnoSuchThingasaFreeLunch;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
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
		discount();
		taxationistheft = 0.08 * secondsubtotal;
		total = taxationistheft+secondsubtotal;
		
		System.out.println("-=-=-=-=-=-=-=-=-Receipt-=-=-=-=-=-=-=-=-");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("");
		format("Subtotal", subtotal);
		System.out.printf("\n*%10s ******************** %6.2s%%", "Discount", thereisnoSuchThingasaFreeLunch);
		format("Tax", taxationistheft);
		format("Total", total);
		System.out.println("\n----------------------------------------");
		System.out.println("* Thanks for your support (Not Really) *");
	}
	
	public static void format(String word, double number)
	{
		System.out.printf("\n*%10s ******************** %7.2f", word, number);
	}
	
	public static void discount()
	{
		if(subtotal >= 2000)
		{
			secondsubtotal = 0.85*subtotal;
			thereisnoSuchThingasaFreeLunch = "15";
		}
		else
		{
			secondsubtotal = subtotal;
			thereisnoSuchThingasaFreeLunch = "0";
		}
	}
}