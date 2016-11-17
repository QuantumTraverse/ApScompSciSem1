import java.util.Scanner;
public class getOdds
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.print("\nThere are " + getOdds() + " odd numbers.");
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random()*100) + 1;
	}
	public static void printArray()
	{
		System.out.print("For the following numbers... ");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	public static int getOdds()
	{
		int odds = 0;
		for(int num : numbers)
		{
			if(num%2 == 1)
			{
				odds++;
			}
		}
		return odds;
	}
}