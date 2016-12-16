import java.util.Random;
import java.util.Scanner;
public class divisor
{
	static Scanner kb = new Scanner(System.in);
	static Random rand = new Random();
	public static void main (String[]args)
	{
	int [][] randomnum = new int [4][4];
	fillArray(randomnum);
	printArray(randomnum);
	System.out.println("Please enter a number: ");
	int divisor = kb.nextInt();
	System.out.println("There are " + divisability(randomnum, divisor) + " divisible by " + divisor + " in the Array.");
	}
	public static void fillArray(int[][] randomnum)
	{
		for(int i =0; i < randomnum.length; i++)
		{
			for(int j =0; j < randomnum.length; j++)
				randomnum [i][j] = 1+rand.nextInt(100);
		}
	}
	public static void printArray(int[][] randomnum)
	{
		for(int i =0; i < randomnum.length; i++)
		{
			for(int j =0; j < randomnum.length; j++)
				System.out.print(randomnum[i][j] + " ");
			System.out.print("\n");
		}
	}
	public static int divisability (int[][] randomnum, int divisor)
	{
		int count = 0;
		for(int i =0; i < randomnum.length; i++)
		{
			for(int j =0; j < randomnum.length; j++)
			{
				if (randomnum[i][j]%divisor == 0)
					count++;
			}
		}
		return count;
	}
}