import java.util.Random;
import java.util.Scanner;
public class divisor
{
	static Random rand = new Random();
	public static void main (String[]args)
	{
	int [][] randomnum = new int [4][4];
	fillArray(randomnum);
	printArray(randomnum);
	System.out.println("Please enter a number: ");
	int divisor = kb.nextInt();
	}
	public static void fillArray(int[][] randomnum)
	{
		for(int i =0; i < randomnum.length; i++)
		{
			for(int j =0; j < randomnum.length; j++)
				randomnum [i][j] = rand.nextInt(10);
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
	public static int divisability (int[][] randomnum)
	{
		int count = 0;
		for(int i =0; i < randomnum.length; i++)
		{
			for(int j =0; j < randomnum.length; j++)
			{
				if (randomnum[i][j]%2 == 0)
					count++;
			}
		}
		return count;
	}
}