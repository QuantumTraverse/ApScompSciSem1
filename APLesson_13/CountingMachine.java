import java.util.Scanner;
import java.util.ArrayList;

public class CountingMachine
{
	public static void main(String[]args)
	{
		double total = 0.00;
		ArrayList<Money> inventory = new ArrayList<Money>();
		inventory.add(new Coin("Penny", "2.5", 00.01));
		inventory.add(new Coin("Nickel", "5.0", 00.05));
		inventory.add(new Coin("Dime", "2.268", 00.10));
		inventory.add(new Coin("Quarter", "5.670", 00.25));
		inventory.add(new Coin("Half Dollar", "11.34", 00.50));
		inventory.add(new Coin("Dollar", "2.5", 01.00));
		inventory.add(new Bill("One", "Washington", 01.00));
		inventory.add(new Bill("Two", "Jefferson", 02.00));
		inventory.add(new Bill("Five", "Lincoln", 05.00));
		inventory.add(new Bill("Ten", "Hamilton", 10.00));
		inventory.add(new Bill("Twenty", "Jackson", 20.00));
		inventory.add(new Bill("Fifty", "Grant", 50.00));
		inventory.add(new Bill("Hundred", "Franklin", 100.00));
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your bills and coins...");
		String cash = kb.nextLine();
		Scanner scan = new Scanner(cash);
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(Money b : inventory)
			{
				if(b.scan().equals(x) || b.getName().equals(x))
				{
					b.setCount(b.getCount()+1);
				}
			}
		}
		for(Money x : inventory)
		{
			total += x.getValue() * x.getCount();
		}
		
		System.out.println(total);
	}
}