import java.util.Scanner; 

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Receipt form = new Receipt();
		
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		double subtotal = price1+price2+price3;
		double taxationistheft = 0.08 * subtotal;
		double total = taxationistheft+subtotal;
		
		System.out.println("-=-=-=-=-=-=-Receipt-=-=-=-=-=-=-");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format("Subtotal", subtotal);
		form.format("Tax", taxationistheft);
		form.format("Total", total);
		System.out.println("\n---------------------------------");
		System.out.println("* Thanks for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*%10s ************** %4.2f", word, number);
	}
	
}