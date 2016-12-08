import java.util.Random;
public class randomNums
{
	static Random rand = new Random();
	public static void main (String[]args)
	{
	int [][] randomnum = new int [4][4];
	fillArray(randomnum);
	printArray(randomnum);
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
}